package logic;

import java.util.ArrayList;

import models.Orbit;

public class OrbitController {

    public ArrayList<Orbit> orbits;

    public OrbitController () {
        this.orbits = new ArrayList<Orbit>();
    }

    public OrbitController ( final ArrayList<Orbit> orbits ) {
        this.orbits = orbits;
    }

    public void update () {
        for ( final Orbit o : orbits ) {
            o.update();
        }
    }

}
