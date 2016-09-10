package abstractFactory.pattern;

public class Apple implements AbstractFactory{

	@Override
	public Phone createPhone() {
		// TODO Auto-generated method stub
		System.out.println("This is apple phone!");
		return new ApplePhone("5s");
	}

	@Override
	public Computer createComputer() {
		// TODO Auto-generated method stub
		System.out.println("This is apple compter!");
		return new AppleComputer("air");
	}

	@Override
	public Pad createPad() {
		// TODO Auto-generated method stub
		System.out.println("This is apple pad!");
		return new ApplePad("mini");
	}

}
