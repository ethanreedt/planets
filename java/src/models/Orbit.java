package models;

import util.Point;

public class Orbit {

    private final Point        bodyPosition;
    private final OrbitingBody body;
    private final double       radius;

    /** time (used for now as radians for orbit) **/
    private double             t;

    public Orbit ( final OrbitingBody body, final double radius ) {
        this.body = body;
        this.radius = radius;
        this.bodyPosition = new Point( radius * Math.cos( t ), radius * Math.sin( t ) );
    }

    public void update ( final double epoch ) {
        final double nextX = radius * Math.cos( epoch );
        final double nextY = radius * Math.sin( epoch );
        bodyPosition.setX( nextX );
        bodyPosition.setY( nextY );
        setEpoch( epoch );
    }

    public Body getBody () {
        return this.body;
    }

    public Point getPosition () {
        return this.bodyPosition;
    }

    public void setEpoch ( final double epoch ) {
        this.t = epoch;
    }

    public double getEpoch () {
        return this.t;
    }

}
