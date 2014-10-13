import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class App {
	public static void main(String[] args) {
		File file = new File("plik1.txt");

		try (BufferedWriter br = new BufferedWriter(new FileWriter(file))) {
			br.write("This is line one\n");
			br.write("This is line two");
			br.newLine();
			br.write("Last line.");

		} catch (IOException e) {
			System.out.println("B³¹d wejœcia/wyjœcia " + file.toString());
		}
	}
}
