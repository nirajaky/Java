package world;

public class Field {
	private Plant plant = new Plant();
	public Field(){
		//size is protected; field is in the same package as Plant.
		System.out.println(plant.size); 
	}
}
