package forest;

public class Oak extends Plant {

	public Oak() {
		super();
		this.type="tree";
		
		// Won't work since this is a private field
		// this.size="small";
		
		this.color="brown";
		System.out.println(this.type + this.color);
	}
}
