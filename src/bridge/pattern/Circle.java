package bridge.pattern;

public class Circle extends Shape{
	public Circle(Drawing drawing){
		super(drawing);
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		drawCircle();
	}
}
