package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

import logic.OrbitController;
import models.CentralBody;
import models.Orbit;
import models.OrbitingBody;
import util.Point;

public class OrbitControllerTest {

    private OrbitController oc;
    private CentralBody     sun;
    private OrbitingBody    earth;
    private OrbitingBody    mars;
    private Orbit           earthsOrbit;
    private Orbit           marsOrbit;

    @Before
    public void setUp () throws Exception {

        sun = new CentralBody( "sun", 300.0 );
        earth = new OrbitingBody( "earth", 30.0, sun );
        mars = new OrbitingBody( "mars", 100.0, sun );

        final double earthRadius = 1.0;
        final double marsRadius = 2.5;

        earthsOrbit = new Orbit( earth, earthRadius );
        marsOrbit = new Orbit( mars, marsRadius );

        oc = new OrbitController( sun );
    }

    @Test
    public void testCentralBody () {
        oc = new OrbitController( sun );
        assertEquals( "sun", oc.getCentralBody().getName() );

        // oc.setCentralBody( earth );
        // assertEquals( "earth", oc.getCentralBody().getName() );
    }

    @Test
    public void testAddRemoveOrbit () {
        oc.addOrbit( earthsOrbit );
        assertEquals( 1, oc.orbits.size() );
        assertEquals( oc.getEpoch(), oc.getOrbit( "earth" ).getEpoch(), 0.0000001 );

        oc.addOrbit( earthsOrbit );
        assertEquals( 1, oc.orbits.size() );

        oc.addOrbit( marsOrbit );
        assertEquals( 2, oc.orbits.size() );

        oc.addOrbit( earthsOrbit );
        assertEquals( 2, oc.orbits.size() );

        oc.removeOrbit( earthsOrbit );
        assertEquals( 1, oc.orbits.size() );
        assertEquals( "mars", oc.getOrbit( oc.orbits.size() - 1 ).getBody().getName() );

    }

    @Test
    public void testGetOrbit () {
        oc.addOrbit( earthsOrbit );
        assertEquals( "earth", oc.getOrbit( oc.orbits.size() - 1 ).getBody().getName() );

        assertEquals( earthsOrbit, oc.getOrbit( "earth" ) );

        // TODO: error check for getting orbit that does not exist
        assertNull( oc.getOrbit( "Tatooine" ) );
    }

    @Test
    public void testUpdate () {
        oc.addOrbit( earthsOrbit );
        final Point pos1 = oc.getOrbit( "earth" ).getPosition();
        final double epoch1 = oc.getEpoch();
        oc.update();
        assertNotEquals( pos1, oc.getOrbit( "earth" ).getPosition() );
        assertNotEquals( epoch1, oc.getEpoch() );
    }

}
