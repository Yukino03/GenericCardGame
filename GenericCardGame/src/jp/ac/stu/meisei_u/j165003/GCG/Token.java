/**
 *
 */
package jp.ac.stu.meisei_u.j165003.GCG;

/**
 * @author yukino-mac
 *
 */
public class Token {
	public String kind;
	public String value;

	/**
	 * @param kind
	 * @param value
	 */
	public Token(String kind,String value) {
		this.kind = kind;
		this.value = value;
	}

	@Override
	public String toString() {
		return value+" : "+kind;
	}
}
