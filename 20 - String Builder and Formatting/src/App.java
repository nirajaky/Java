public class App {

	public static void main(String[] args) {
		// Inofficiant
		String info = "";
		info += "My name is Bob.";
		info += " ";
		info += "I am a builder";
		System.out.println(info);

		// More efficiant
		StringBuilder sb = new StringBuilder("");

		sb.append("My name is Sue.");
		sb.append(" ");
		sb.append("I am a lion taner.");

		System.out.println(sb.toString());

		StringBuilder a = new StringBuilder();
		a.append("My name is Roger.").append(" ").append("I am a Skydiver");
		System.out.println(a.toString());

		// FORMATTING int

		System.out.print("Some text.\tTAB \nNewLINE");
		System.out.println(" More text");
		System.out.printf("Total cost: %-10d, quantity: %d\n", 5, 123);
		for(int i=0;i<20;i++){
			System.out.printf("%-2d: %s \n",i, "some text");
		}
		//formatting float
		System.out.printf("Total values %.2f\n", 5.6864);
		System.out.printf("Total values %-9.1f\n", 543.6864);
	}
}
