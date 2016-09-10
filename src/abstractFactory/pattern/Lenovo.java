package abstractFactory.pattern;

public class Lenovo implements AbstractFactory{

	@Override
	public Phone createPhone() {
		// TODO Auto-generated method stub
		System.out.println("This is lenovo phone!");
		return new LenovoPhone("8825D");
	}

	@Override
	public Computer createComputer() {
		// TODO Auto-generated method stub
		System.out.println("This is lenovo computer!");
		return new LenovoComputer("Y-480");
	}

	@Override
	public Pad createPad() {
		// TODO Auto-generated method stub
		System.out.println("This is lenovo pad!");
		return new LenovoPad("876");
	}

}
