package opgave02.models;

public class PercentDiscount extends Discount {
    private int percent;

    public PercentDiscount(String description, int percent){
        super(description);
        this.percent = percent;
    }

    @Override
    public double applyDiscount(double amount){
        return (percent / 100.0) * amount;
    }
}