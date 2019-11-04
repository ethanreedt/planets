package models;

import util.Point;

public class Orbit {

    final private double       RADIAN_UPDATE_INTERVAL = 0.1;

    private final Point        bodyPosition;
    private final OrbitingBody body;
    private final double       radius;

    /** time (used for now as radians for orbit) **/
    private double             t;

    public Orbit ( final OrbitingBody body, final double radius ) {
        this.body = body;
        this.radius = radius;
        this.t = 0;
        this.bodyPosition = new Point( radius * Math.cos( t ), radius * Math.sin( t ) );
    }

    public void update () {
        t = t + RADIAN_UPDATE_INTERVAL;
        final double nextX = radius * Math.cos( t );
        final double nextY = radius * Math.sin( t );
        bodyPosition.setX( nextX );
        bodyPosition.setY( nextY );
    }

}
