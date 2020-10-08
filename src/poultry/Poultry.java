package poultry;

public abstract class Poultry {
    private float price;
    private String poultryType;

    Poultry(float price, String poultryType) {
        this.price = price;
        this.poultryType = poultryType;
    }

    public float getPrice() {
        return price;
    }

    public String getPoultryType() {
        return poultryType;
    }

    public abstract int buyPoultryPortion(int randomVar);
}