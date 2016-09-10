package visitor.pattern;

public interface DiagramElement {
	public void accept(Checker c);
	//other operations
}
