package Assignment1;

public class Movie {

	int movieId;
	String movieTitle;
	String releaseDate;
	String genre;
	public Movie(int movieId, String movieTitle, String releaseDate, String genre) {
		super();
		this.movieId = movieId;
		this.movieTitle = movieTitle;
		this.releaseDate = releaseDate;
		this.genre = genre;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getMovieTitle() {
		return movieTitle;
	}
	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieTitle=" + movieTitle + ", releaseDate=" + releaseDate + ", genre="
				+ genre + "]";
	}
	
}
