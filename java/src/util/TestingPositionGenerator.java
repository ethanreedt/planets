package util;

import java.util.HashMap;

import models.Orbit;
import models.Point;

public class TestingPositionGenerator {

    private final Orbit                  o;

    private final HashMap<Double, Point> positions;

    public TestingPositionGenerator ( final Orbit o ) {
        this.o = o;
        positions = new HashMap<Double, Point>();
    }

    public void createPositions ( final Orbit o ) {

    }

    public Point posAtTime ( final double epoch ) {

    }

}
