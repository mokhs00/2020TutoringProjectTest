package Domain;

import java.time.LocalTime;

public class Screening {

    private Movie movie;
    private LocalTime runningTime;
    private int ticketedCount = 0;

    public Screening(Movie movie, LocalTime runningTime) {
        this.movie = movie;
        this.runningTime = runningTime;

    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public LocalTime getRunningTime() {
        return runningTime;
    }

    public void setRunningTime(LocalTime runningTime) {
        this.runningTime = runningTime;
    }

    public int getTicketedCount() {
        return ticketedCount;
    }

    public void setTicketedCount(int ticketedCount) {
        this.ticketedCount = ticketedCount;
    }
    }
