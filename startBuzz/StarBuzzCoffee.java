package startBuzz;

import startBuzz.condimentos.Creme;
import startBuzz.condimentos.Mocha;
import startBuzz.condimentos.Soja;

public class StarBuzzCoffee {
    public static void main(String[] args) {

        Beverage beverage = new Expresso();
        System.out.println(beverage.getDescription() + " $:" + beverage.cost());

        Beverage beverage2 = new DarkRoast();

        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Creme(beverage2);

        System.out.println(beverage2.getDescription() + " $:" + beverage2.cost());


        Beverage beverage3 = new HouseBlend();

        beverage3 = new Soja(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Creme(beverage3);

        System.out.println(beverage3.getDescription() + " $:" + beverage3.cost());
    }
}
