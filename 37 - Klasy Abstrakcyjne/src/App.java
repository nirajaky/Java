public class App {
	public static void main(String[] args) {
		Camera cam1 = new Camera();
		cam1.setId(5);
		Car car1 = new Car();
		car1.setId(3);

		car1.run();
		
		// Klasa abstrakcyjna - nie mo¿na utworzyæ obiektu machine1
		// Machine machine1 = new Machine();

	}
}
