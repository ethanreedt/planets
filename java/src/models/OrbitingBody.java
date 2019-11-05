package models;

public class OrbitingBody extends Body {

    public Body  orbitingAround;
    public Orbit orbit;

    public OrbitingBody ( final String name, final double mass, final Body orbitingAround ) {
        super( name, mass );
        this.orbitingAround = orbitingAround;
        this.orbit = null;
    }

    public void setOrbit ( final Orbit o ) {
        this.orbit = o;
    }

    public Orbit getOrbit () {
        return orbit;
    }

    public Body orbitingAround () {
        return this.orbitingAround;
    }

}
