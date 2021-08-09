package simDuck;

public abstract class Duck {
    FlyBehavior flyBehavior;

    QuackBehavier quackBehavior;

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void setQuackBehavior(QuackBehavier qb) {
        this.quackBehavior = qb;
    }

    public void setFlyBehavior(FlyBehavior fb) {
        this.flyBehavior = fb;
    }

    public void swin() {
        System.out.println("All ducks float, even decoys");
    }

}