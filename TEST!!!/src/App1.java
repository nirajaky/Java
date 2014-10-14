import java.util.Scanner;

public class App1 {
	public static void main(String[] args) {
		// //////////Improved Use of Scanner////////////
		/*
		 * int value = 0; Scanner input = new Scanner(System.in); while (value
		 * != 5) { System.out.println("Wpisz 5!"); if(input.hasNextInt()) {
		 * value = input.nextInt(); } else { input.nextLine(); } }
		 * System.out.println("Got it!"); input.close();
		 */

		// /////////Switch Statements/////////////
		/*
		 * int value = 0; Scanner input = new Scanner(System.in); value =
		 * input.nextInt(); switch (value) { case 1:
		 * System.out.println("Got 1"); break; case 66:
		 * System.out.println("Got 66"); break; default:
		 * System.out.println("Got another"); break; }
		 */
		int value = 0;
		Scanner input = new Scanner(System.in);
		do{
			System.out.println("Podaj liczbe");
			value = input.nextInt();			
		}
		while(value <= 10);
		System.out.println("Liczba wiêksza ni¿ 10 wykryta");
	}
}
