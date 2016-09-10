package abstractFactory.pattern;

public class Controller {
	AbstractFactory factory;
	public void setFactory(AbstractFactory factory){
		this.factory=factory;
	}
	public void use(){
		factory.createPhone();
		factory.createComputer();
		factory.createPad();
	}
}
