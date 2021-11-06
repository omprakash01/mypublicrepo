package spring_example_1_4_DI;

public class MovieFinder {
	private String movieName;
	
	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public void findMovieName() {
		System.out.println("Movie name: " + this.movieName);
	}
}
