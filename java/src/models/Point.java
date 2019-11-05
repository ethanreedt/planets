package models;

public class Point {

    private double x;
    private double y;

    public Point ( final double x, final double y ) {
        this.x = x;
        this.y = y;
    }

    public double x () {
        return x;
    }

    public double y () {
        return y;
    }

    public double distanceFrom ( final Point p ) {
        final double xDist = p.x() - x;
        final double yDist = p.y() - y;
        final double dist = Math.sqrt( ( xDist * xDist ) + ( yDist * yDist ) );
        return dist;
    }

    public void setX ( final double newX ) {
        x = newX;
    }

    public void setY ( final double newY ) {
        y = newY;
    }

    public void set ( final double newX, final double newY ) {
        x = newX;
        y = newY;
    }
}
