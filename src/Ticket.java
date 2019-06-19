
public class Ticket {
	
	private String ticketId;
	private User user;
	private Movie movie;
	private Show show;
	private String seatName;
	private int cost;
	
	public Ticket(String ticketId,User user,Movie movie,Show show,String seatName,int cost) {			
		this.ticketId=ticketId;
		this.show=show;
		this.user=user;
		this.movie=movie;
		this.seatName=seatName;
		this.cost=cost;
	}
	
	public void printTicket() {	
		System.out.println("--------------------------");
		System.out.println("Ticket Number:"+ticketId);
		System.out.println("User Name	 :"+user.getName());
		System.out.println("MovieName	 :"+movie.getName());
		Screen s=show.getScreenObj();
		System.out.println("Screen Name      :"+s.getScreenName());
		System.out.println("Show Timing	 :"+show.getTiming());
		System.out.println("SeatNo 		 :"+seatName);
		System.out.println("Cost		 :"+cost);
		System.out.println("");
		Screen scr=show.getScreenObj();
		System.out.println(scr.getAddOns());
		System.out.println("--------------------------");
	}


}
