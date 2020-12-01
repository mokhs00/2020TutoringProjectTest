package Domain;


import java.time.LocalTime;

public class Movie {

    private String name;
    private LocalTime runTime;
    private int ageLimit = 0;
    private String genre; // 장르

    public Movie(String name, LocalTime runTime, String genre) {
        this.name = name;
        this.runTime = runTime;
        this.genre = genre;
    }

    public Movie(String name, LocalTime runTime, int ageLimit, String genre) {
        this.name = name;
        this.runTime = runTime;
        this.ageLimit = ageLimit;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalTime getRunTime() {
        return runTime;
    }

    public void setRunTime(LocalTime runTime) {
        this.runTime = runTime;
    }

    public int getAgeLimit() {
        return ageLimit;
    }

    public void setAgeLimit(int ageLimit) {
        this.ageLimit = ageLimit;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
