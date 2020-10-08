package poultry;

public class Cock extends Poultry {
    public Cock() {
        super(5, "Cock");
    }

    @Override
    public int buyPoultryPortion(int randomVar) {
        return randomVar * 4;
    }
}
