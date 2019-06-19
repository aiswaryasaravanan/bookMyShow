
public class Show {
	
	private String id;
	private String timing;
	private Screen screen;
	
	public Show(String id,String timing,Screen screen){
		this.id=id;
		this.timing=timing;
		this.screen=screen;
	}
	
	public String getShowId() {
		return id;
	}
	
	public String getTiming() {
		return timing;
	}
	
	public void setTiming(String timing) {
		this.timing=timing;
	}
	
//	public String getScreen() {
//		return screen.getScreenName();
//	}
	
	public Screen getScreenObj() {
		return screen;
	}
	
}
