import java.util.Date;

public class Euro {
    private int amount;

    public Euro(int amount) {

        this.amount = amount;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if(other==null)
            return false;
        if (getClass() != other.getClass()) {
            if (other.getClass()==Dollar.class) {
                Dollar dollar = (Dollar) other;
                if (dollar.getAmount() == amount * 1.35)
                    return true;
            }
            return false;

        }

        Euro euro = (Euro) other;

        return amount == euro.amount;


    }

    @Override
    public int hashCode() {
        return amount;
    }

    public Euro add(Euro other) {

        return new Euro(other.amount + this.amount);
    }

}
