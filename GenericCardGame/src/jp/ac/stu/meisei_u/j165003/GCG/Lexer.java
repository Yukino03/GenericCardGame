/**
 *
 */
package jp.ac.stu.meisei_u.j165003.GCG;

import java.util.ArrayList;
import java.util.List;

/**
 * 1行のスクリプトを受け取り、トークンのArrayListを返します。<br><br>
 * 1. lex = new Lexer(line)<br>
 * 2. tokens = lex.Tokenize()
 * @author yukino-mac
 */
public class Lexer {
	private int i;
	private String line;
	private List<String> blankets = new ArrayList<String>();

	public Lexer(String line) {
		i=0;//Focus on first Character.
		this.line = line;
		ScriptReader sr = new ScriptReader("blankets.txt");
		blankets.addAll(sr.getList());
	}
	public List<Token> Tokenize() throws Exception {
		List<Token> tokens = new ArrayList<Token>();
		Token t = new Token("Indent",skipSpace());
		tokens.add(t);
		t = nextToken();
		while(t!=null) {
			tokens.add(t);
			t = nextToken();
		}
		return tokens;
	}
	private Token nextToken() throws Exception {
		skipSpace();
		if(isEOL()) {
			return null;
		}else if(isSign(scanChar())) {
			return Sign();
		}else if(isDigit(scanChar())) {
			return Digit();
		}else if(isAlph(scanChar())) {
			return Variable();
		}else if(isColon(scanChar())) {
			return Head();
		}else if(isBlanket(scanChar())){
			return Blanket();
		}else {
			throw new Exception("Not a character.");
		}
	}

	/**
	 * フォーカスは移動せず現在位置の文字を取得します.
	 * @return 現在フォーカス(i番目)している1文字.
	 * @throws Exception
	 */
	private char scanChar() throws Exception {
		if(isEOL())throw new Exception("End of Line.");
		return line.charAt(i);
	}
	private String skipSpace() throws Exception {
		Integer indent=0;
		while(!isEOL() && Character.isWhitespace(scanChar())) {
			next();
			indent++;
		}
		return indent.toString();
	}
	/**
	 * 現在フォーカスしている1文字を返すと同時に1文字進めます.
	 * @return フォーカスしている1文字.
	 * @throws Exception
	 */
	private char next() throws Exception {
		char c = scanChar();
		i++;
		return c;
	}


//トークン種別ごとの処理
	private Token Digit() throws Exception {
		StringBuilder b = new StringBuilder();
		b.append(next());
		while(!isEOL() && isDigit(scanChar())) {
			b.append(next());
		}
		Token t = new Token("Digit",b.toString());
		return t;
	}
	private Token Variable() throws Exception {
		StringBuilder b = new StringBuilder();
		b.append(next());
		while(!isEOL() && (isAlph(scanChar()) || isDigit(scanChar()))) {
			b.append(next());
		}
		Token t = new Token("Variable",b.toString());
		return t;
	}
	private Token Sign() throws Exception {
		Token t = new Token("Sign",Character.toString(next()));
		return t;
	}
	private Token Head() throws Exception {
		Token t = new Token("Head",Character.toString(next()));
		return t;
	}
	private Token Blanket() throws Exception {
		Token t = new Token("Blanket",Character.toString(next()));
		return t;
	}

//文字判断
	private boolean isDigit(char c) throws Exception {
		return Character.isDigit(c);
	}
	private boolean isAlph(char c) throws Exception {
		return Character.isAlphabetic(c) || c == '_';
	}
	private boolean isSign(char c) {
		return c=='+' || c=='-' || c=='*' || c=='/' || c=='=';
	}
	private boolean isColon(char c) {
		return c==':';
	}
	private boolean isBlanket(char c) {
		return blankets.contains(Character.toString(c));
	}
	private boolean isEOL() {
		return line.length() <= i;
	}
}
