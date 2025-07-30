package oopClass.sec16;

public class Earth {

    static final double EARTH_RADIUS = 6400;
    static final double EARTH_SURFACE_RADIUS;

    static {
        EARTH_SURFACE_RADIUS = 4*Math.PI * EARTH_RADIUS * EARTH_RADIUS;
    }

}
