class Machine {
	private String name;
	private int code;

	public Machine() {
		this("Arnie", 0);
		System.out.println("Kontruktor dzia³a!");

		// name = "Arnie";

	}

	public Machine(String name) {
		this(name, 0);
		System.out.println("Drugi konstruktor dzia³a!");
		this.name = name;
	}

	public Machine(String name, int code) {
		
		System.out.println("Trzeci dzia³a!");
		this.name = name;
		this.code = code;
	}
}

public class App {

	public static void main(String[] args) {
		Machine machine1 = new Machine();
		//Machine machine2 = new Machine("Kamil");
		//Machine machine3 = new Machine("Trol", 2432);
	}

}
