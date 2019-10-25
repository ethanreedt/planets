package models;

public class Orbit {

    public OrbitalElements elements;

    public Orbit(OrbitalElements oe) {
        this.elements = oe;
    }

    /**
     * @return the elements
     */
    public OrbitalElements getElements() {
        return elements;
    }

    public void setElements(OrbitalElements oe) {
        this.elements = oe;
    }

}
