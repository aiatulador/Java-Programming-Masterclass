package OOP_Part_1_Inheritance;

public class TvSeries {

    private String tvName = "Game Of Thrones";
    private String platform= "HBO";
    private String genre= "Fantasy";
    private int releaseDate= 2010;
    private double imdbRating= 9.6;
    private boolean bangla = true;

    public String getTvName() {
        return tvName;
    }

    public String getPlatform() {
        return platform;
    }

    public String getGenre() {
        return genre;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public double getImdbRating() {
        return imdbRating;
    }

    public boolean isBangla() {
        return bangla;
    }

    public void setTvName(String tvName) {
        this.tvName = tvName;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setImdbRating(double imdbRating) {
        this.imdbRating = imdbRating;
    }

    public void setBangla(boolean bangla) {
        this.bangla = bangla;
    }

    public void describeTVSeries(){

        System.out.println(tvName+", "+"platform: "+platform+", "+"Genre: "+genre+", "+"Released: "+releaseDate+", "+"IMDB Rating: "+imdbRating+", "+"Available in Bangla: "+ bangla);

    }
}
