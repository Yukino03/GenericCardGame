package jp.ac.stu.meisei_u.j165003.GCG;

import java.util.List;

public class Main {
	// Old Maid
	public static void main(String[] args) throws Exception {
		String path="Old_Maid.grf";
		ScriptReader sr = new ScriptReader(path);

		for(String line :sr.getList()) {
			System.out.println(line);
			List<Token> tokens = new Lexer(line).Tokenize();
			for (Token token : tokens) {
				System.out.println(token.toString());
			}
			System.out.println();
		}
		//		Game game = new Game(path);
		//		Player me= new Player("John","dealer");
		//		Card card =new Card("hart",10,me,true);
		//
		//		System.out.println(me);
		//		System.out.println(card);
		//		System.out.println(path);
		//		System.out.println(game);
		//		game.printSource();
	}
}