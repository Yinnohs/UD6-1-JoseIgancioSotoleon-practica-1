package factory;

import plane.Plane;

public class PlaneFactory {

    public static Plane createPlane (float fuelLevel, String pilotCallSign, String squadNumber){
        return new Plane(fuelLevel, pilotCallSign, squadNumber);
    }
}
