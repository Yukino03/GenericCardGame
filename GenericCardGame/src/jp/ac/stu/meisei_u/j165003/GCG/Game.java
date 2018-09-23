/**
 *
 */
package jp.ac.stu.meisei_u.j165003.GCG;

/**
 * @author yukino-mac
 *
 */
public class Game {
	public Game(String path) {
		ScriptReader sr = new ScriptReader(path);
	}

	public void Start() {
		System.out.println("Start Called.");
	}
	public void Step() {
		System.out.println("Step Called.");
	}
}