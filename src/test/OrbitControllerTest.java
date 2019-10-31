package test;

import org.junit.Before;
import org.junit.Test;

import logic.OrbitController;
import models.Body;
import models.CentralBody;
import models.Orbit;
import models.OrbitingBody;

public class OrbitControllerTest {

    private OrbitController oc;
    private Body            sun;
    private Body            earth;
    private Body            mars;
    private Orbit           earthsOrbit;

    @Before
    public void setUp () throws Exception {
        final Body sun = new CentralBody( "sun", 300.0 );
        final Body earth = new OrbitingBody( "earth", 30.0, sun );
        final Body mars = new OrbitingBody( "mars", 100.0, sun );

        final Orbit earthsOrbit = new Orbit( earth, radius );
    }

    @Test
    public void testCentralBody () {
        oc = new OrbitController( sun );
        assertEquals( "sun", oc.getCentralBody().getName() );

        oc.setCentralBody( earth );
        assertEquals( "earth", oc.getCentralBody().getName() );
    }

    @Test
    public void testAddOrbit () {
        oc.addOrbit( earth );
        assertEquals( 1, oc.orbits.size() );

        oc.addOrbit( earth );
        assertEquals( 1, oc.orbits.size() );

        oc.addOrbit( mars );
        assertEquals( 2, oc.orbits.size() );

        oc.removeOrbit( earth );
        assertEquals( 1, oc.orbits.size() );
        assertEquals( "earth", oc.getOrbit( oc.orbits.size() - 1 ) );

        // error check for removing orbits when no orbits exist

    }

}
