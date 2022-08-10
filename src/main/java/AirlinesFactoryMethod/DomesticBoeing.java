package AirlinesFactoryMethod;



import java.util.ArrayList;

public class DomesticBoeing implements BoeingInterface{

    private int totalSeat;

    private ArrayList<Integer> AvailableSeats = new ArrayList<Integer>(totalSeat);



    @Override
    public ArrayList<Integer> BookSeats() {

        return null;
    }

    @Override
    public ArrayList<Integer> getAvailableSeats() {

        System.out.println("Available Seats:"+AvailableSeats);
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
        System.out.println("Available Seats:"+AvailableSeats);

    }
}
