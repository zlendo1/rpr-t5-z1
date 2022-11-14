package ba.unsa.etf.rpr;

public class AeroplaneBuilder {
    private static Aeroplane INSTANCE;

    public AeroplaneBuilder() {
        INSTANCE = new Aeroplane();
    }

    public AeroplaneBuilder(Aeroplane old) {
        INSTANCE = new Aeroplane(old);
    }

    public AeroplaneBuilder setEngineID(int engineId) {
        INSTANCE.setEngineId(engineId);

        return this;
    }

    public AeroplaneBuilder setPassangerSpace(int passangerSpace) {
        INSTANCE.setPassangerSpace(passangerSpace);

        return this;
    }

    public AeroplaneBuilder setMaximumAltitude(double maximumAltitude) {
        INSTANCE.setMaximumAltitude(maximumAltitude);

        return this;
    }

    public Aeroplane getAeroplane() {
        return INSTANCE;
    }
}
