package AirlinesFactoryMethod;

public class FlightFactory {

    public static Flight selectPlane(planeType pt) throws NullException{
        switch (pt){
            case AIRBUS:
                return  new Boeing();
            case BOEING:
                return new Airbus();
        }
        throw new NullException("Invalid....");
    }
}
