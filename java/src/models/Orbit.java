package models;

import util.Equation;

public class Orbit {

    private Point              bodyPosition;
    private final OrbitingBody body;
    private final double       radius;

    /** time (used for now as radians for orbit) **/
    private double             t;

    public Orbit ( final OrbitingBody body, final double radius, final double epoch ) {
        this.body = body;
        this.radius = radius;
        this.t = epoch;
        this.bodyPosition = Equation.simpleOrbitPos( radius, epoch );
    }

    public void update ( final double epoch ) {
        setEpoch( epoch );
        bodyPosition = Equation.simpleOrbitPos( getRadius(), getEpoch() );
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

    public double getRadius () {
        return this.radius;
    }

}
