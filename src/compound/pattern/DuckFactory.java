package compound.pattern;

public class DuckFactory extends AbstractDuckFactory {

	@Override
	public Quackable createMallardDuck() {
		// TODO Auto-generated method stub
		return new MallardDuck();
	}

	@Override
	public Quackable createRedheadDuck() {
		// TODO Auto-generated method stub
		return new RedheadDuck();
	}

	@Override
	public Quackable createDuckCall() {
		// TODO Auto-generated method stub
		return new DuckCall();
	}

	@Override
	public Quackable createrRubberDuck() {
		// TODO Auto-generated method stub
		return new RubberDuck();
	}
	
}
