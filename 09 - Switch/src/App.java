import java.util.Scanner;

public class App {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a command: ");
		String text = input.nextLine();

		switch (text) {
		case "start":
			System.out.println("Started");
			break;

		case "stop":
			System.out.println("Stopped");
			break;

		default:
			System.out.println("Command unknow");
		}
		
		
	}
}
