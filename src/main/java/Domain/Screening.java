package Domain;

import java.util.Date;

public class Screening {

    private Movie movie;
    private Date runningTime;
    private int ticketedCount;

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Date getRunningTime() {
        return runningTime;
    }

    public void setRunningTime(Date runningTime) {
        this.runningTime = runningTime;
    }

    public int getTicketedCount() {
        return ticketedCount;
    }

    public void setTicketedCount(int ticketedCount) {
        this.ticketedCount = ticketedCount;
    }
}
