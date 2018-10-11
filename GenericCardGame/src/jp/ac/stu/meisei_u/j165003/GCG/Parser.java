/**
 *
 */
package jp.ac.stu.meisei_u.j165003.GCG;

import java.util.List;

/**
 * @author yukino-mac
 *
 */
public class Parser {
	private List<Token> tokens;
	private int depth;
	public Parser(List<Token> tokens) {
		this.tokens = tokens;
		this.depth = Integer.valueOf(this.tokens.remove(0).value);
	}
	private void parse() {
		if(isAtomic()) {
		}
	}
	private boolean isAtomic() {
		return false;
	}
	private Object eval() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

}
