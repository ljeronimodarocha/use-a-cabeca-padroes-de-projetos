package startBuzz.condimentos;

import startBuzz.Beverage;

public class LeiteComEspuma extends CondimentDecorator {
    public Beverage beverage;

    public LeiteComEspuma(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Leite com espuma";
    }

    @Override
    public double cost() {
        return 0.10 + this.beverage.cost();
    }

}
