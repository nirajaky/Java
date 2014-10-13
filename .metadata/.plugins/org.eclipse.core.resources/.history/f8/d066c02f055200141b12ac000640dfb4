import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App2 {
	public static void main(String[] args) {
		File file = new File("plik1.txt");

		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String line;
			int count = 0;
			while ((line = br.readLine()) != null) {
				System.out.println(line + " " + count);
				count++;
			}
		} catch (FileNotFoundException e) {
			System.out.println("Plik nie znaleziony! " + file.toString());
		} catch (IOException e) {
			System.out.println("B³¹d wejœcia/wyjœcia " + file.toString());
		}
	}
}
