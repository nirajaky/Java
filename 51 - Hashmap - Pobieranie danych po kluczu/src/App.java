import java.util.HashMap;
import java.util.Map;

public class App {

	public static void main(String[] args) {
		// HashMap nie jest posortowany,
		HashMap<Integer, String> map = new HashMap<Integer, String>();

		map.put(5, "Five");
		map.put(2, "Lol");
		map.put(6, "Six");
		map.put(7, "Seven");
		map.put(9, "Nine");
		map.put(1, "One");

		map.put(1, "OVERLOAD");
		String text = map.get(1);

		System.out.println(text);

		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + " " + value);

		}
	}

}
