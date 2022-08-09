package AirlinesFactoryMethod;

public class Boeing implements Flight {
    @Override
    public AirbusInterface selectAirbusFlight(flightType ft) {
        return null;
    }

    @Override
    public BoeingInterface selectBoeingFlight(flightType ft) {
        switch (ft) {
            case DOMESTIC:
                return new DomesticBoeing();
            case INTERNATIONAL:
                return new InternationalBoeing();
        }
        return null;
    }
}
