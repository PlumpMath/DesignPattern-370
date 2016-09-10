package abstractFactory.pattern;

public class TestFactory {
	public static void main(String args[]){
		Controller con=new Controller();
		con.setFactory(new Lenovo());
		con.use();
		
		System.out.println("\nset another factory.\n");
		con.setFactory(new Apple());
		con.use();
	}
}
