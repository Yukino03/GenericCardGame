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
	public int row=0;

	/**
	 * This method read text file & store to List.
	 * If text file is changed, call reload() method.
	 * @return {@code true} if successful of load file.
	 * @throws IOException
	 */
	private void loadFile() throws IOException {
		lines = Files.readAllLines(path);
		row = lines.size();
	}
	/**
	 *
	 * @throws IOException
	 */
	public void reload() throws IOException {
		loadFile();
	}
	/**
	 * Get any line from source code.
	 * @param index index of list. (count from 0)
	 * @return String line.
	 */
	public String getLine(int index) {
		return lines.get(index);
	}
	public void printSource() {
		for(int i=0;i<row;i++)System.out.println(lines.get(i));
	}
	public List<String> getList(){
		return lines;
	}

	public String toString() {
		return "ScriptReader [path=" + path + ", title=" + title + ", author=" + author + "]";
	}
}
