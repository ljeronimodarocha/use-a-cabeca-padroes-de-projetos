package simDuck;

public class ModelDuck extends Duck{

    public ModelDuck(){
        super.flyBehavior = new FlyNoWay();
        super.quackBehavior = new Quack();
    }

    @Override
    public void display() {
        // TODO Auto-generated method stub
        System.out.println("I'm a model duck!");
    }
    
}
