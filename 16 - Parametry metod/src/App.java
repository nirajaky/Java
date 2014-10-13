class Robot{
	
	public void speak(String text){
		System.out.println(text);
	}
	public void jump(int wysokosc) {
		System.out.println("Jumping: " + wysokosc);
	}
	public void move(String direction, double distance){
		System.out.println("Moving " + distance + "m in direction " + direction);
	}
	
}
public class App {
	public static void main(String[] args) {
		Robot sam = new Robot();
		
		sam.speak("Hi I'm sam.");
		sam.jump(7);
		sam.move("west", 12.5);
		
		String greetings = "Hello there";
		sam.speak(greetings);
		
		int value = 15;
		sam.jump(value);
	}
	
}
