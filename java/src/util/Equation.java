package util;

import models.Point;

public class Equation {

    /** Orbit **/

    public static Point simpleOrbitPos ( final double r, final double t ) {
        final double x = r * Math.cos( t );
        final double y = r * Math.sin( t );
        return new Point( x, y );
    }

}
