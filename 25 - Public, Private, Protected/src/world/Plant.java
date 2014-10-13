package world;
public class Plant {
	// bad practice
	public String name;
	// Akceptowalna praktyka... it's final.
	public final static int ID = 8;

	private String type;

	protected String size;
	int height;

	
	public Plant() {
		this.name = "Freddy";
		this.type = "plant";
		this.size = "large";
		this.height = 10;
	}

}
