package AirlinesFactoryMethod;

import java.util.ArrayList;

public interface AirbusInterface {
    ArrayList<Integer> BookSeats() ;
    ArrayList<Integer> getAvailableSeats();
    public int getTotalSeat() ;
    public void setTotalSeat(int totalSeat);
}
