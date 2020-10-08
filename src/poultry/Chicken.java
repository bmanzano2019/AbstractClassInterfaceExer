package poultry;

public class Chicken extends Poultry {
    public Chicken() {
        super((float) 1/3, "Chicken");
    }

    @Override
    public int buyPoultryPortion(int randomVar) {
        return 75 + (randomVar * 3);
    }
}
