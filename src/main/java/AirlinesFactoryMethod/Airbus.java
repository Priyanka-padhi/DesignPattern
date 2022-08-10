package AirlinesFactoryMethod;

public class Airbus implements Flight {

    @Override
    public AirbusInterface selectAirbusFlight(flightType ft) throws NullException {

            switch (ft) {
                case DOMESTIC:
                    return new DomesticAirbus();
                case INTERNATIONAL:
                    return new InternationalAirbus();
            }


            throw new NullException("Null");

       //return null;
    }

    @Override
    public BoeingInterface selectBoeingFlight(flightType ft) {
        return null;
    }
}
