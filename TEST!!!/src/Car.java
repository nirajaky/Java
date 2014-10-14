public class Car {
	public String name;

	public Car(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void start() {
		System.out.println("Started!");
	}
}