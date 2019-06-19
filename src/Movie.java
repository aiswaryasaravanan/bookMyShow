import java.util.ArrayList;
import java.util.Iterator;

public class Movie {
	private String id;
	private String name;
	private int rating;

	private ArrayList<Show> shows=new ArrayList<Show>();
	
	public Movie(String id,String name,int rating) {			
		this.id=id;
		this.name=name;
		this.rating=rating;
	}
	
	public int getRating() {									
		return rating;
	}
	
	public String getName() {									
		return name;
	}
	
	public ArrayList<Show> getShows(){
		return shows;
	}
	
	public void addShows(Show s) {					
		shows.add(s);
	}
	
	public void removeShows(Show s) {				
		shows.remove(s);
	}

}
