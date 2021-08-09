package startBuzz;

public class DarkRoast extends Beverage{

    DarkRoast(){
        this.description = "Dark Roast Coffee!";
    }

    @Override
    public double cost() {
        return 0.99;
    }
    
}
