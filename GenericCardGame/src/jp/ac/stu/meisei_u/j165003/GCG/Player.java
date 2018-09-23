package jp.ac.stu.meisei_u.j165003.GCG;

class Player {
	public Player(String string, String string2) {
		name=string;
		role=string2;
	}
	String name;
	String role;

	public String toString() {
		return name+","+role;
	}
}
