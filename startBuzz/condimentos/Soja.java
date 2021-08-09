package startBuzz.condimentos;

import startBuzz.Beverage;

public class Soja extends CondimentDecorator{
    public Beverage beverage;

    public Soja(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soja";
    }

    @Override
    public double cost() {
        return 0.15 + this.beverage.cost();
    }
    
}
