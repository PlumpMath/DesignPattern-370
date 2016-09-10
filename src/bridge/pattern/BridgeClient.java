package bridge.pattern;

public class BridgeClient {
	public static void main(String[] args){
		Drawing draw1=new V1Drawing();
		Drawing draw2=new V2Drawing();
		
		Shape shape1=new Rectangle(draw1);
		shape1.draw();
		
		Shape shape2=new Circle(draw2);
		shape2.draw();
		
		Shape shape3=new Circle(draw1);
		shape3.draw();

	}
}
