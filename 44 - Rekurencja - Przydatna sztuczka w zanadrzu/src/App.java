public class App {
	public static void main(String[] args) {
		//e.g. 4! = 4*3*2*1
		
		System.out.println(silnia(12));
	}

	private static int silnia(int value) {
		//System.out.println(value);
		if (value == 1) {
			return 1;
		}
		return silnia(value - 1)*value;
	}
}
