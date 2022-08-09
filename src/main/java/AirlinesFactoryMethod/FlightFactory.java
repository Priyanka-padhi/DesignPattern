package AirlinesFactoryMethod;

public class FlightFactory {

    public static Flight selectPlane(planeType pt){
        switch (pt){
            case AIRBUS:
                return  new Boeing();
            case BOEING:
                return new Airbus();
        }
        return null;
    }
}
