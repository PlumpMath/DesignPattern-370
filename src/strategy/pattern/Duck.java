package strategy.pattern;

public abstract class Duck {
	public FlyBehavior flyBehavior;
	public QuackBehavior quackBehavior;

	public void performQuck(){
		quackBehavior.quack();
	}
	public abstract void display();
	public void performFly(){
		flyBehavior.fly();
	}
	public void swim(){
		System.out.println("All ducks float, even decoys!");
	}
}
