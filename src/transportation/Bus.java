package transportation;

public class Bus implements Vehicle {
    private static final int transportationFee = 300;
    private String companyOwner = "";

    public Bus() { }

    public Bus(String companyOwner) {
        this.companyOwner = companyOwner;
    }

    @Override
    public int getTransportationFee() {
        return transportationFee;
    }

    @Override
    public String getOwner() {
        return companyOwner;
    }
}
