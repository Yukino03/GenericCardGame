package jp.ac.stu.meisei_u.j165003.GCG;

import java.io.IOException;

public class Main {
// Old Maid
	public static void main(String[] args) throws IOException {
		String path="Old_Maid.grf";
		Game game = new Game(path);
		Player me= new Player("John","dealer");
		Card card =new Card("hart",10,me,true);

		System.out.println(me);
		System.out.println(card);
		System.out.println(path);
		System.out.println(game);
		game.printSource();
	}
}