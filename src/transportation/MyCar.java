package transportation;

public class MyCar implements Vehicle {
    private static final int transportationFee = 500;
    private String name = "";

    public MyCar() { }

    public MyCar(String name) {
        this.name = name;
    }

    @Override
    public int getTransportationFee() {
        return transportationFee;
    }

    @Override
    public String getOwner() {
        return name;
    }
}
