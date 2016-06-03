import forest.Plant;

public class Field {
	
	public Field() {
		super();
		Plant plant = new Plant();
		
		// Can't access protected value in a different package
		// System.out.println(plant.color);
	}


}
