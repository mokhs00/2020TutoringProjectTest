package Domain;

import java.util.ArrayList;

public class Room {
    private int number;
    private int seatCount;
    private ArrayList<Screening> screeningList;


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    public ArrayList<Screening> getScreeningList() {
        return screeningList;
    }

    public void setScreeningList(ArrayList<Screening> screeningList) {
        this.screeningList = screeningList;
    }

    // 1. inner class  2. 따로 > 상영 리스트 출력



}
