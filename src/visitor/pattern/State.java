package visitor.pattern;

public class State implements DiagramElement{

	@Override
	public void accept(Checker c) {
		// TODO Auto-generated method stub
		c.check(this);
	}
	//other operations
	
}
