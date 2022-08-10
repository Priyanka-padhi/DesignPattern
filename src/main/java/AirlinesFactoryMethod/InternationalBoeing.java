package AirlinesFactoryMethod;

import java.util.ArrayList;

public class InternationalBoeing implements BoeingInterface{

    int totalSeat;
    public ArrayList<Integer> AvailableSeats = new ArrayList<Integer>(totalSeat);


    @Override
    public ArrayList<Integer> BookSeats() {

        return null;
    }

    @Override
    public ArrayList<Integer> getAvailableSeats() {

        System.out.println("Available Seat"+AvailableSeats);
        return AvailableSeats;
    }

    @Override
    public int getTotalSeat() {
        return totalSeat;
    }

    public void setTotalSeat(int totalSeat) {

        this.totalSeat = totalSeat;
        for (int i = 1; i <= totalSeat; i++) {
            this.AvailableSeats.add(i);

        }
    }
}
