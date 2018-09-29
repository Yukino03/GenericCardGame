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

	/**
	 * ゲームの開始時に呼び出され、スクリプトを読み始めます。
	 * 同時にゲームの初期化が行われます。
	 */
	public void start() {
		System.out.println("Start Called.");
	}
	/**
	 * スクリプトを読み進めます。
	 * 後ろには戻れません。
	 */
	public void next() {
		System.out.println("Step Called.");
	}

	public void printSource() {
		// TODO 自動生成されたメソッド・スタブ

	}
}