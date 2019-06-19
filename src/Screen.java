import java.util.*;

public abstract class Screen {
	protected String name;
	protected int availableSeat;
	protected int totalSeats;
	protected int cost;
	
	private ArrayList<Seat> seats=new ArrayList<Seat>();
	
	public Screen() {}
	
	abstract String getAddOns();
	
	public void addSeats(Seat seat) {
		seats.add(seat);
	}
	
	public String getScreenName() {
		return name;
	}
	
	public int getCost() {
		return cost;
	}
	
	public ArrayList<Seat> getSeats(){
		return seats;
	}
	
}
//	
//	public int getCost() {
//		return cost;
//	}
//	
//	public int getAvailableSeat() {
//		return availableSeat;
//	}
//	
//	public void updateTotalSeatsAvailable(int count) {
//		availableSeat+=count;
//	}
//	
	


//	public boolean getSeatStatus(String seatNo) {
//		Seat s=seat.get(seatNo);
//		if(s.getState()==1) {
//			return true;
//		}else {
//			return false;
//		}
//	}
//	public void lockSeat(String seatNumber) {
//			Seat s=seat.get(seatNumber);
//			s.lockSeat();
//			updateTotalSeatsAvailable(-1);		
//	}
//	
//	public void bookSeats(int noOfSeats) {
//		int i=0;
//		int flag=0;
//		String[] seatList=new String[noOfSeats];
//		Scanner inp=new Scanner(System.in);
//		if(noOfSeats<getTotalSeatsAvailable()) {
//			while(i<=noOfSeats) {
//				String seatNo=inp.next();
//				if(getSeatStatus(seatNo)) {
//					System.out.println("Current seat is available...");
//					i++;flag=1;
//					seatList[i-1]=seatNo;
//				}else {
//					System.out.println("Current seat is not available...");
//					flag=0;
//				}
//			}
//			for(int j=0;j<noOfSeats;j++) {
//				lockSeat(seatList[j]);
//			}
//			
//		}
//	}

	

