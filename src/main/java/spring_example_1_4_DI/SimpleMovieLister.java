package spring_example_1_4_DI;

public class SimpleMovieLister {
	
	private MovieFinder movieFinder;

	public SimpleMovieLister() {}
	
    // a constructor so that the Spring container can inject a MovieFinder
    public SimpleMovieLister(MovieFinder movieFinder) {
        this.movieFinder = movieFinder;
    }
    
 // a setter method so that the Spring container can inject a MovieFinder
    public void setMovieFinder(MovieFinder movieFinder) {
        this.movieFinder = movieFinder;
    }

    
    public void displayList() {
    	movieFinder.findMovieName();
    }
}
