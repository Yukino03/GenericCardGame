/**
 *
 */
package jp.ac.stu.meisei_u.j165003.GCG;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author yukino-mac
 *
 */
public class Reflection {
	private List<Method> methods = new ArrayList<Method>();
	Class<Game> clazz = Game.class;
	public void init() {
		this.methods.addAll(Arrays.asList(clazz.getDeclaredMethods()));
	}
	public void exec(String word) {

	}
	public boolean search(String word) {
		return match(word);
	}
	private boolean match(String word) {

	}

}
