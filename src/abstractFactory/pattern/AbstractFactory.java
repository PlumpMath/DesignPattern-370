package abstractFactory.pattern;

public interface AbstractFactory {
	public Phone createPhone();
	public Computer createComputer();
	public Pad createPad();
}
