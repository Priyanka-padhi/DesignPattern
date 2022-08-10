package AirlinesFactoryMethod;

public interface Flight {
    AirbusInterface selectAirbusFlight(flightType ft) throws NullException;
    BoeingInterface selectBoeingFlight(flightType ft) throws NullException;

}
