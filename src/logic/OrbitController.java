package logic;

import java.util.ArrayList;

import models.CentralBody;
import models.Orbit;

public class OrbitController {

    public ArrayList<Orbit> orbits;
    public CentralBody      centralBody;

    public OrbitController ( final CentralBody cb ) {
        this.centralBody = centralBody;
        this.orbits = new ArrayList<Orbit>();
    }

    public CentralBody getCentralBody () {
        return centralBody;
    }

    public void setCentralBody () {

    }

    public void update () {
        for ( final Orbit o : orbits ) {
            o.update();
        }
    }

}
