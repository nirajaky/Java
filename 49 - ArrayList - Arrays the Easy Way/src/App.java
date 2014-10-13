import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		// Dodawanie
		numbers.add(10);
		numbers.add(100);
		numbers.add(140);
		// pobieranie
		System.out.println(numbers.get(0));
		// Iteracja w pêtli for
		System.out.println("Iteracja 1");
		for (int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
		System.out.println("Iteracja 2");
		for (Integer value : numbers) {
			System.out.println(value);
		}
		// This is very slow
		numbers.remove(0);
		System.out.println("Iteracja po usuniêciu pierwszego");
		for (Integer value : numbers) {
			System.out.println(value);
		}
		// Removing items (careful!)
		numbers.remove(numbers.size() - 1);
		System.out.println("Iteracja po usuniêciu ostatniego");
		for (Integer value : numbers) {
			System.out.println(value);
		}
		// List interface ...
		List<String> values = new ArrayList<String>();
	}
}
