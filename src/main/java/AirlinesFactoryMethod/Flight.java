package AirlinesFactoryMethod;

public interface Flight {
    AirbusInterface selectAirbusFlight(flightType ft);
    BoeingInterface selectBoeingFlight(flightType ft);

}
