package startBuzz.condimentos;

import startBuzz.Beverage;

public class Creme extends CondimentDecorator {

    public Beverage beverage;

    public Creme(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Creme";
    }

    @Override
    public double cost() {
        return 0.10 + this.beverage.cost();
    }

}
