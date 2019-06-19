import java.util.*;
public class User {
	
	private String name;
	private String mailId;
	private ArrayList<Movie> movies=new ArrayList<Movie>();
	
	public User(String name,String mailId) {
		this.name=name;
		this.mailId=mailId;
	}
	
	public void addMovies(Movie movie) {
		movies.add(movie);
	}
	
	public void removeMovies(Movie movie) {
		movies.remove(movie);
	}
	
	public String getName() {
		return name;
	}
}
