package physics;

public class Vector {

    private double x;
    private double y;
    private double z;

    public Vector ( final double x, final double y, final double z ) {
        setVector( x, y, z );
    }

    public void setVector ( final double x, final double y, final double z ) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector getVector () {
        return this;
    }

}
