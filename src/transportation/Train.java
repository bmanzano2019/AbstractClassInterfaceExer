package transportation;

public class Train implements Vehicle {
    private static final int transportationFee = 400;
    private String trainCompanyOwner = "";

    public Train() { }

    public Train(String trainCompanyOwner) {
        this.trainCompanyOwner = trainCompanyOwner;
    }

    @Override
    public int getTransportationFee() {
        return transportationFee;
    }

    @Override
    public String getOwner() {
        return trainCompanyOwner;
    }
}

