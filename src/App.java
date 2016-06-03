
import forest.Oak;
import forest.Plant;

public class App {

	public static void main(String[] args) {
		
		Plant plant = new Plant();
		plant.type="domestic";
		
		Oak oak = new Oak();
		
		
		// Won't work since size is private
		// plant.size="small";
		
		// Won't work since color is protected and in another package
		// plant.color="black";

	}

}
