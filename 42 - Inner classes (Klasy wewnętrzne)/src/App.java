public class App {
	public static void main(String[] args) {

		Robot robot1 = new Robot(7);
		robot1.start();
		//dzia�a tylko je�li Brain jest public
		//Robot.Brain brain = robot1.new Brain();
		//brain.think();
		
		Robot.Battery battery = new Robot.Battery();
		battery.charge();
	}
}
