package startBuzz.condimentos;

import startBuzz.Beverage;

public class Mocha extends CondimentDecorator {

    public Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return .20 + this.beverage.cost();
    }

}
