public class App {

	public static void main(String[] args) {
		Machine mark1 = new Machine();
		mark1.start();
		mark1.stop();
		
		Car car1 = new Car();
		
		car1.start();
		car1.wipeWindShield();
		car1.shoInfo();
		car1.stop();
	}
}
