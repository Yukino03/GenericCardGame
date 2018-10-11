/**
 *
 */
package jp.ac.stu.meisei_u.j165003.GCG;

/**
 * @author yukino-mac
 *
 */
public class REPL {
	public REPL() {
	}
	public Game interpriter(String line) {
		Parser parse = new Parser(new Lexer(line).Tokenize());
		return Game;
	}
}
