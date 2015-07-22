package labNumber19;

public class Movie implements Comparable {
	public String title; 
	public String category; 
	
	public Movie(String title, String category)
	{
		this.title = title; 
		this.category = category; 
	}

	@Override
	public String toString() {
		return "Movie [title=" + title + ", category=" + category + "]";
	}

	@Override
	public int compareTo(Object o) {
		//Cast movie because compareTo takes an object
		Movie i = (Movie) o;
		return this.title.compareToIgnoreCase(i.title); 
	}

}
