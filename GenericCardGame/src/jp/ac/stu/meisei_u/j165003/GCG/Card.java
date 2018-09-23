package jp.ac.stu.meisei_u.j165003.GCG;

/**
 * @author Yuki_Akino
 *
 *
 */
class Card {
	public Card(String string, int i, Player me, boolean b) {
		num=i;
		symbol=string;
		owner=me;
		visibly=b;
	}
	Player owner;
	boolean visibly;//reverse
	String symbol;
	int num;
	public String toString() {
		return symbol+","+num;
	}
}
