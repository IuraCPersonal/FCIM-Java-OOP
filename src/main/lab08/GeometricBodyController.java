package main.lab08;

import java.util.ArrayList;

class GeometricBodyController {
    static GeometricBody getBiggestSurface(ArrayList<GeometricBody> geometricBodies){
        GeometricBody max = geometricBodies.get(0);

        for(GeometricBody fig: geometricBodies)
            max = fig.getSurface() > max.getSurface() ? fig : max;

        return max;
    }

    static GeometricBody getBiggestVolume(ArrayList<GeometricBody> geometricBodies){
        GeometricBody max = geometricBodies.get(0);

        for(GeometricBody fig: geometricBodies)
            max = fig.getVolume() > max.getVolume() ? fig : max;

        return max;
    }
}