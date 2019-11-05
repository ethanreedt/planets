package logic;

import java.util.ArrayList;

import models.CentralBody;
import models.Orbit;

public class OrbitController {

    final private double    RADIAN_UPDATE_INTERVAL = 0.1;

    public ArrayList<Orbit> orbits;
    public CentralBody      centralBody;
    public double           epoch;

    public OrbitController ( final CentralBody cb ) {
        this.centralBody = cb;
        this.orbits = new ArrayList<Orbit>();
    }

    public CentralBody getCentralBody () {
        return centralBody;
    }

    public void setCentralBody ( final CentralBody cb ) {
        this.centralBody = cb;
    }

    public void addOrbit ( final Orbit o ) {
        if ( !orbits.contains( o ) ) {
            orbits.add( o );
        }
    }

    public Orbit getOrbit ( final int oIdx ) {
        return orbits.get( oIdx );
    }

    public Orbit getOrbit ( final String name ) {
        for ( final Orbit o : orbits ) {
            if ( o.getBody().getName().equals( name ) ) {
                return o;
            }
        }
        return null;
    }

    public void removeOrbit ( final String name ) {
        orbits.remove( getOrbit( name ) );
    }

    public void removeOrbit ( final Orbit o ) {
        orbits.remove( o );
    }

    public double getEpoch () {
        return epoch;
    }

    public void update () {
        for ( final Orbit o : orbits ) {
            this.epoch = epoch + RADIAN_UPDATE_INTERVAL;
            o.update( epoch );
        }
    }

}
