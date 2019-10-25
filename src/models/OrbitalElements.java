package models;

public class OrbitalElements {

    // Shape and size
    private double eccentricity;
    private double semiMajorAxis;
    // Orientation of orbital plane
    private double inclination;
    private double longitudeOfAscendingNode;
    // Others
    private double argOfPeriapsis;
    private double trueAnomaly;

    public OrbitalElements ( final double eccentricity, final double semiMajorAxis, final double inclination,
            final double longitudeOfAscendingNode, final double argOfPeriapsis, final double trueAnomoly ) {
        this.eccentricity = eccentricity;
        this.semiMajorAxis = semiMajorAxis;
        this.inclination = inclination;
        this.longitudeOfAscendingNode = longitudeOfAscendingNode;
        this.argOfPeriapsis = argOfPeriapsis;
        this.trueAnomaly = trueAnomoly;
    }

    public double getEccentricity () {
        return eccentricity;
    }

    public void setEccentricity ( final double eccentricity ) {
        this.eccentricity = eccentricity;
    }

    public double getSemiMajorAxis () {
        return semiMajorAxis;
    }

    public void setSemiMajorAxis ( final double semiMajorAxis ) {
        this.semiMajorAxis = semiMajorAxis;
    }

    public double getInclination () {
        return inclination;
    }

    public void setInclination ( final double inclination ) {
        this.inclination = inclination;
    }

    public double getLongitudeOfAscendingNode () {
        return longitudeOfAscendingNode;
    }

    public void setLongitudeOfAscendingNode ( final double longitudeOfAscendingNode ) {
        this.longitudeOfAscendingNode = longitudeOfAscendingNode;
    }

    public double getArgOfPeriapsis () {
        return argOfPeriapsis;
    }

    public void setArgOfPeriapsis ( final double argOfPeriapsis ) {
        this.argOfPeriapsis = argOfPeriapsis;
    }

    public double getTrueAnomaly () {
        return trueAnomaly;
    }

    public void setTrueAnomaly ( final double trueAnomaly ) {
        this.trueAnomaly = trueAnomaly;
    }

}
