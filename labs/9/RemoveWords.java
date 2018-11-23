import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class RemoveWords {
	public static void main(String[] args) throws FileNotFoundException {
		File input = new File (args[1]);
		String word = args[0];
		File text = new File ("temp.txt");
		Scanner readFile = new Scanner(input);
		PrintWriter pw = new PrintWriter(text);
		
		while (readFile.hasNext()) {
			String x = readFile.nextLine();
			x = x.replaceAll(word, "");
			pw.println(x);
		}
		
		
		readFile.close();
		pw.close();
		input.delete();
		text.renameTo(input);
	}
}
