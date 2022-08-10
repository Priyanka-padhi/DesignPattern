package AirlinesFactoryMethod;

public class Boeing implements Flight {
    @Override
    public AirbusInterface selectAirbusFlight(flightType ft)throws NullException {
        throw new NullException("Null");
    }

    @Override
    public BoeingInterface selectBoeingFlight(flightType ft) throws NullException {
        switch (ft) {
            case DOMESTIC:
                return new DomesticBoeing();
            case INTERNATIONAL:
                return new InternationalBoeing();
        }
        throw new NullException("Null");
    }
}
