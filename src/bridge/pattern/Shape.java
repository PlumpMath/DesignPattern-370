package bridge.pattern;

public abstract class Shape {
	protected Drawing myDrawing;
	abstract public void draw();
	public Shape(Drawing drawing){
		myDrawing=drawing;
	}
	public void drawLine(){
		myDrawing.drawLine();
	}
	public void drawCircle(){
		myDrawing.drawCircle();
	}
}
