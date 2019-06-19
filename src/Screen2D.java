
public class Screen2D extends Screen{
	
	
	
//	private static String type="2DScreen";
	
	public Screen2D(String name,int totalSeats,int cost) {
		this.name=name;
		this.totalSeats=totalSeats;
		this.cost=cost;
	}
	
	public String getAddOns() {
		String message="You will be provided with Snack";
		return message;
	}
	
//	public String getType() {
//		return type;
//	}
}
