
public class Movie {
	
	private int num;
	private String movieTitle;
	private String actor;
	private int movieRating;
	private int date;
	private int cnt;
	private double ratingAverage;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}

	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	public int getMovieRating() {
		return movieRating;
	}
	public void setMovieRating(int movieRating) {
		this.movieRating = movieRating;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public double getRatingAverage() {
		return ratingAverage;
	}
	public void setRatingAverage(double ratingAverage) {
		this.ratingAverage = ratingAverage;
	}
	public String getMovieTitle() {
		return movieTitle;
	}
	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}
	@Override
	public String toString() {
		return "Movie [num=" + num + ", movieTitle=" + movieTitle + ", actor=" + actor + ", movieRating=" + movieRating
				+ ", date=" + date + ", cnt=" + cnt + ", ratingAverage=" + ratingAverage + "]";
	}

	

}
