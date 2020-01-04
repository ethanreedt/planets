package strategy;

import models.Orbit;
import models.Point;

public interface OrbitStrategy {

    public Point getPosition ( Orbit o );

}
