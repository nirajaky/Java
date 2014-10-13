import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App {
	public static void main(String[] args) throws IOException {
		File file = new File("plik1.txt");
		BufferedReader br = null;
		try {
			FileReader fr = new FileReader(file);
			br = new BufferedReader(fr);

			String line;
			int count = 0;
			while ((line = br.readLine()) != null) {
				System.out.println(line + " " + count);
				count++;
			}

		} catch (FileNotFoundException e) {
			System.out.println("Plik nieznaleziony: " + file.toString());
		} catch (IOException e) {
			System.out.println("Niemo�liwy do odczytania: " + file.toString());
		}
		// bez wzgl�du na wyj�tki zawsze si� wykona!
		finally {
			try {
				br.close();
			} catch (IOException e) {
				System.out.println("Nie mog� zamkn�� pliku" + file.toString());
			} catch (NullPointerException ex) {
				System.out.println("Co� si� syp�o :)");
			}
		}

	}
}
