
public class Seat {
	
	private String name;
	private String type;	//balcony or normal
	
	public Seat(String name,String type) {
		this.name=name;
		this.type=type;
	}
//	
//	public void lockSeat() {
//		state=0;
//	}
//	
//	public void unlockSeat() {
//		state=1;
//	}
//	
//	public int getState() {
//		return state;
//	}
//	
	public String getName() {
		return name;
	}
	
	public String getSeatType() {
		return type;
	}
	
}
