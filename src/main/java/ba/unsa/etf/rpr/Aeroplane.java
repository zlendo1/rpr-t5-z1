package ba.unsa.etf.rpr;

public class Aeroplane implements Cloneable {
    private int engineId;
    private int passangerSpace;
    private double maximumAltitude;

    public Aeroplane() {}

    public Aeroplane(Aeroplane a) {
        this.engineId = a.engineId;
        this.passangerSpace = a.passangerSpace;
        this.maximumAltitude = a.maximumAltitude;
    }

    public Aeroplane(int engineId, int passangerSpace, double maximumAltitude) {
        this.engineId = engineId;
        this.passangerSpace = passangerSpace;
        this.maximumAltitude = maximumAltitude;
    }

    public Aeroplane(AeroplaneBuilder ab) {
        this.setEngineId(ab.getAeroplane().getEngineId());
        this.setPassangerSpace(ab.getAeroplane().getPassangerSpace());
        this.setMaximumAltitude(ab.getAeroplane().getMaximumAltitude());
    }

    public int getEngineId() {
        return engineId;
    }

    public void setEngineId(int engineId) {
        this.engineId = engineId;
    }

    public int getPassangerSpace() {
        return passangerSpace;
    }

    public void setPassangerSpace(int passangerSpace) {
        this.passangerSpace = passangerSpace;
    }

    public double getMaximumAltitude() {
        return maximumAltitude;
    }

    public void setMaximumAltitude(double maximumAltitude) {
        this.maximumAltitude = maximumAltitude;
    }

    @Override
    public Aeroplane clone() {
        try {
            Aeroplane clone = (Aeroplane) super.clone();

            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
