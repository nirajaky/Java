class Plant {
	// final - nie mo�na zmieni�
	public static final int ID = 7;
	private String name;

	public String getData() {
		String data = "Who care";
		return data;
	}

	private int Oblicz() {
		return 9;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

public class App {

	public static void main(String[] args) {
		System.out.println(Plant.ID);
		Plant plant1 = new Plant();
		System.out.println(plant1.getData());
		
	}

}
