import java.util.*;

public class TicketBooking implements Runnable{
    private static ArrayList<Movie> movies = new ArrayList<Movie>(); // movieName, movie
    private static HashMap<Show, ShowBooking> bookings=new HashMap<Show,ShowBooking>();
    
	private static TicketBooking ticketbooking=null;
	
	private TicketBooking() {
	}
	
	private static TicketBooking getInstance() {
		if(ticketbooking==null) {
			ticketbooking=new TicketBooking();
		}
		return ticketbooking;
	}

	static {

	    Movie movie1 = new Movie("m1", "Mr.Local", 10);addMovie(movie1);
	    Screen screen1 = new Screen2D("s1", 16, 150);
	    Show show1 = new Show("sh1-10", "10:00", screen1);
	    Show show2 = new Show("sh1-18", "18:00", screen1);
	    

		Seat seat11=new Seat("s11","normal");
		Seat seat12=new Seat("s12","normal");
		Seat seat13=new Seat("s13","normal");
		Seat seat14=new Seat("s14","normal");
		
		Seat seat21=new Seat("s21","normal");
		Seat seat22=new Seat("s22","normal");
		Seat seat23=new Seat("s23","normal");
		Seat seat24=new Seat("s24","normal");

		Seat seat31=new Seat("s31","normal");
		Seat seat32=new Seat("s32","normal");
		Seat seat33=new Seat("s33","normal");
		Seat seat34=new Seat("s34","normal");

		Seat seat41=new Seat("s41","balcony");
		Seat seat42=new Seat("s42","balcony");
		Seat seat43=new Seat("s43","balcony");
		Seat seat44=new Seat("s44","balcony");

		Seat seat51=new Seat("s51","balcony");
		Seat seat52=new Seat("s52","balcony");
		Seat seat53=new Seat("s53","balcony");
		Seat seat54=new Seat("s54","normal");

	    screen1.addSeats(seat11);	    screen1.addSeats(seat21);	    screen1.addSeats(seat31);	    screen1.addSeats(seat41);
	    screen1.addSeats(seat12);	    screen1.addSeats(seat22);	    screen1.addSeats(seat32);	    screen1.addSeats(seat42);
	    screen1.addSeats(seat13);	    screen1.addSeats(seat23);	    screen1.addSeats(seat33);	    screen1.addSeats(seat43);
	    screen1.addSeats(seat14);	    screen1.addSeats(seat24);	    screen1.addSeats(seat34);	    screen1.addSeats(seat44);

	    movie1.addShows(show1);
	    movie1.addShows(show2);

	    Movie movie2 = new Movie("m2", "NGK", 7);addMovie(movie2);
	    Screen screen2 = new Screen2D("s2", 14, 150);
	    Show show3 = new Show("sh2-10", "10:00", screen2);
	    Show show4 = new Show("sh2-18", "18:00", screen2);
	    Show show5 = new Show("sh2-22", "22:00", screen2);
	    
	    screen2.addSeats(seat11);	    screen2.addSeats(seat21);	    screen2.addSeats(seat31);	    screen2.addSeats(seat41);
	    screen2.addSeats(seat12);	    screen2.addSeats(seat22);	    screen2.addSeats(seat32);	    screen2.addSeats(seat42);
	    screen2.addSeats(seat13);	    screen2.addSeats(seat23);	    screen2.addSeats(seat33);	    screen2.addSeats(seat43);
	    screen2.addSeats(seat14);	    screen2.addSeats(seat24);	    
	    
	    movie2.addShows(show3);
	    movie2.addShows(show4);
	    movie2.addShows(show5);

	    Movie movie3 = new Movie("m3", "Aladdin", 9);addMovie(movie3);
	    Screen screen3 = new Screen2D("s3", 16, 150);
	    Screen screen4 = new Screen3D("s4", 18, 200);
	    Show show6 = new Show("sh3-10", "10:00", screen3);
	    Show show7 = new Show("sh3-18", "18:00", screen3);
	    Show show8 = new Show("sh4-14", "14:00", screen4);
	    
	    screen3.addSeats(seat11);	    screen3.addSeats(seat21);	    screen3.addSeats(seat31);	    screen3.addSeats(seat41);
	    screen3.addSeats(seat12);	    screen3.addSeats(seat22);	    screen3.addSeats(seat32);	    screen3.addSeats(seat42);
	    screen3.addSeats(seat13);	    screen3.addSeats(seat23);	    screen3.addSeats(seat33);	    screen3.addSeats(seat43);
	    screen3.addSeats(seat14);	    screen3.addSeats(seat24);	    screen3.addSeats(seat34);	    screen3.addSeats(seat44);
	    
	    screen4.addSeats(seat11);	    screen4.addSeats(seat21);	    screen4.addSeats(seat31);	    screen4.addSeats(seat41);	screen4.addSeats(seat51);
	    screen4.addSeats(seat12);	    screen4.addSeats(seat22);	    screen4.addSeats(seat32);	    screen4.addSeats(seat42);   screen4.addSeats(seat52);
	    screen4.addSeats(seat13);	    screen4.addSeats(seat23);	    screen4.addSeats(seat33);	    screen4.addSeats(seat43);	
	    screen4.addSeats(seat14);	    screen4.addSeats(seat24);	    screen4.addSeats(seat34);	    screen4.addSeats(seat44);	

	    
	    movie3.addShows(show6);
	    movie3.addShows(show7);
	    movie3.addShows(show8);
	    	     
	     Screen s1=show1.getScreenObj();
	     ShowBooking sb1 = new ShowBooking(show1.getShowId(), s1.getSeats());bookings.put(show1,sb1);
	     Screen s2=show2.getScreenObj();
	     ShowBooking sb2 = new ShowBooking(show2.getShowId(), s2.getSeats());bookings.put(show2,sb2);
	     Screen s3=show3.getScreenObj();
	     ShowBooking sb3 = new ShowBooking(show3.getShowId(), s3.getSeats());bookings.put(show3,sb3);
	     Screen s4=show4.getScreenObj();
	     ShowBooking sb4 = new ShowBooking(show4.getShowId(), s4.getSeats());bookings.put(show4,sb4);
	     Screen s5=show5.getScreenObj();
	     ShowBooking sb5 = new ShowBooking(show5.getShowId(), s5.getSeats());bookings.put(show5,sb5);
	     Screen s6=show6.getScreenObj();
	     ShowBooking sb6 = new ShowBooking(show6.getShowId(), s6.getSeats());bookings.put(show6,sb6);
	     Screen s7=show7.getScreenObj();
	     ShowBooking sb7 = new ShowBooking(show7.getShowId(), s7.getSeats());bookings.put(show7,sb7);
	     Screen s8=show8.getScreenObj();
	     ShowBooking sb8 = new ShowBooking(show8.getShowId(), s8.getSeats());bookings.put(show8,sb8);
	     
	}
	
	private void addMovies(Movie m) {
		movies.add(m);
	}
	
	private void removeMovies(Movie m) {
		movies.remove(m);
	}
	
	private static void addMovie(Movie movie) {
		movies.add(movie);
	}
	
	private static void showMovies() {
		  int i=1;
	      for(Movie m:movies){    
	           System.out.println(i++ +"."+" " + m.getName() + " "+ m.getRating());    
	      }  
	}
	
	public void run(){
			User user1;
			System.out.println("Enter name:");
			Scanner inp=new Scanner(System.in);
			String name=inp.next();
			System.out.println("Enter email:");
			String email=inp.next();
			
			user1=new User(name,email);
			Thread.currentThread().setName(name); 

			Integer movieIndex;
			Movie m;

			System.out.println("The Movies are:");
			showMovies();
			
			System.out.println("Please enter the movie Index");
			movieIndex=inp.nextInt();
			System.out.println("");
			m = movies.get(movieIndex-1);
		    System.out.println("You have selected "+m.getName()+" movie");

		    Integer showIndex;
		    System.out.println(m.getName()+" has been running on the following Screen and timing...");
		    
		    int i=1;
		    for(Show s:m.getShows()) {
		    	Screen scc=s.getScreenObj();
		    	if(scc instanceof Screen2D) {
			    	System.out.println(i++ + ". Screen:" + scc.getScreenName()+"(2D)"+"  Timing: "+s.getTiming() );			    		
		    	}else
			    	System.out.println(i++ + ". Screen:" + scc.getScreenName()+"(3D)"+"  Timing: "+s.getTiming() );			    		
		    }
		    System.out.println("Please select the index for the show...");
		    showIndex=inp.nextInt();
		    
			System.out.println("");

			ShowBooking sb;
			Show sh;

		    ArrayList<Show> showList=m.getShows();
		    sh=showList.get(showIndex-1);
	    	Screen scc=sh.getScreenObj();
			System.out.println("");
		    System.out.println("You have selected the screen:"+scc.getScreenName()+" and Timing:"+sh.getTiming());
		    
			System.out.println("");
		    System.out.println("Seats:");
		    sb=bookings.get(sh);
		    sb.printSeatsBookingStatus();

		synchronized(this) {
				System.out.println("Running" + Thread.currentThread().getName() );
				System.out.println("");
			
			    System.out.println("Enter the no of seats you want:");
			    int noOfSeats=inp.nextInt();
			    if(noOfSeats<=sb.getAvailableSeats()) {
			    	System.out.println("");
				    for(int j=0,flag=0;flag<noOfSeats;j++) {
					    System.out.println("Enter the seat number:");
				    	String seatName=inp.next();

				    	System.out.println("");
				        if(sb.getSeatsBookingStatus().get(seatName)==false){
				            sb.getSeatsBookingStatus().remove(seatName, Boolean.valueOf(true));
				            sb.getSeatsBookingStatus().put(seatName, Boolean.valueOf(true));
				            flag++;
				            Screen sc=sh.getScreenObj();
				    	    Ticket ticket = new Ticket("tid", user1 , m, sh, seatName, sc.getCost());
				    	    System.out.println(seatName +" is successfully booked...");
				    	    ticket.printTicket();
				        } else {
				            System.out.println("Sorry! This seat is already booked");
				        }
				    }  
			    }else {
			    	System.out.println("Sorry! Only "+sb.getAvailableSeats()+"seats are available");
			    }
		}	//end of synchronization   
	}
	
	public static void main(String ar[]) throws ClassNotFoundException,InterruptedException{
		
		TicketBooking ticketbooking=TicketBooking.getInstance();
		Scanner inp=new Scanner(System.in);
//		String choice;

		Thread t1=new Thread(ticketbooking);
		Thread t2=new Thread(ticketbooking);

		t1.start();
		t2.start();
		
	}
}
