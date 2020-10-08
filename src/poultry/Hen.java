package poultry;

public class Hen extends Poultry {
    public Hen() {
        super(3, "Hen");
    }

    @Override
    public int buyPoultryPortion(int randomVar) {
        return 25 - (randomVar * 7);
    }
}
