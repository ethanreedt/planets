package logic;

import java.util.ArrayList;

import models.Orbit;
import models.StateVectors;

public class OrbitController {

    public ArrayList<Orbit> orbits;

    public OrbitController () {
        orbits = new ArrayList<Orbit>();
    }

    public OrbitController ( final ArrayList<Orbit> orbits ) {
        this.orbits = orbits;
    }

    public void createOrbit ( final StateVectors sv ) {

    }

}
