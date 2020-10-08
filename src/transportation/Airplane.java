package transportation;

public class Airplane implements Vehicle {
    private static final int transportationFee = 1000;
    private String airlinesName = "";

    public Airplane() { }

    public Airplane(String airlinesName) {
        this.airlinesName = airlinesName;
    }

    @Override
    public int getTransportationFee() {
        return transportationFee;
    }

    @Override
    public String getOwner() {
        return airlinesName;
    }
}
