
public class Screen3D extends Screen{
	
//	private static String type="3DScreen";


	public Screen3D(String name,int totalSeats,int cost) {
		this.name=name;
		this.totalSeats=totalSeats;
		this.cost=cost;
	}
	
	public String getAddOns() {
		String message= "You will be provided with Snack and 3D glasses";
		return message;
	}
	
//	public String getType() {
//		return type;
//	}
}
