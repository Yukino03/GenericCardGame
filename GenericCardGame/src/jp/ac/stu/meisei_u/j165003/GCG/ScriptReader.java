/**
 *
 */
package jp.ac.stu.meisei_u.j165003.GCG;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * @author yukino-mac
 * @param <path> Receive Path.
 *
 * Use Files & Path.
 * Create a instance for a file.
 * Keep rule source.
 * This management rule source.
 */
public class ScriptReader {
	public ScriptReader(String path) {
		this.path = Paths.get(path);
		try {
			loadFile();
		} catch (IOException e) {
			e.printStackTrace();
			System.err.println("Reading Script Error.");
		}
	}
	Path path;
	/**
	 * List of plain code.
	 */
	private List<String> lines;
	private String title="No title";//Def
	private String author="anonymous";//Def

	/**
	 * This method read text file & store to List.
	 * If text file is changed, call reload() method.
	 * @return {@code true} if successful of load file.
	 * @throws IOException
	 */
	private boolean loadFile() throws IOException {
		lines = Files.readAllLines(path);
		return codeCheck();
	}

	private boolean codeCheck() {
		return true;
	}
	/**
	 *
	 * @return {@code true} if successful of load file.
	 * @throws IOException
	 */
	public boolean reload() throws IOException {
		return loadFile();
	}
	/**
	 * Get any line from source code.
	 * @param index index of list. (count from 0)
	 * @return a line of code.
	 */
	public String printCode(int index) {
		return lines.get(index);
	}
	public void printSource() {
		System.out.println("<Start_of_Lines>");
		for(int i=0;i<lines.size();i++)System.out.println(lines.get(i));
		System.out.println("<End_of_Lines>");
	}

	public String toString() {
		return "ScriptReader [path=" + path + ", title=" + title + ", author=" + author + "]";
	}
}
