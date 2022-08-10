package AirlinesFactoryMethod;

public class AirlineMain {
    public static void main(String[] args)  {
try {
    Flight flight = FlightFactory.selectPlane(planeType.AIRBUS);

    AirbusInterface ab = flight.selectAirbusFlight(flightType.DOMESTIC);

    ab.setTotalSeat(20);
    ab.getAvailableSeats();
    System.out.println(ab.getAvailableSeats());
    System.out.println(ab.getTotalSeat());
}
catch(Exception e){
    e.printStackTrace();
}
    }
}
