package bridge.pattern;

public class Rectangle extends Shape{
	public Rectangle(Drawing drawing){
		super(drawing);
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		drawLine();
		drawLine();
		drawLine();
	}

}
