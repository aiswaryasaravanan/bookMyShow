import java.util.*;

public class ShowBooking {

		//private Date date;
		private String showId;
		private HashMap<String,Boolean> seatsBookingStatus=new HashMap<String,Boolean>();
		
		public ShowBooking(String showId,ArrayList<Seat> seats) {
			this.showId=showId;
			for(Seat s: seats) {
				seatsBookingStatus.put(s.getName(),false);
			}
		}
		
		public HashMap<String,Boolean> getSeatsBookingStatus(){
			return seatsBookingStatus;
		}
		
		public void printSeatsBookingStatus(){
			for(Map.Entry m:seatsBookingStatus.entrySet()){ 
		           System.out.println(m.getKey()+" "+m.getValue());    
			}		
		}
		
		public int getAvailableSeats() {
			int count=0;
			for(Map.Entry m:seatsBookingStatus.entrySet()){ 
		           if(! (Boolean)m.getValue()) {
		        	   count++;
		           }
			}
			return count;
			
		}
}
