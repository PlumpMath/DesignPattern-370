package composite2.pattern;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client client =new Client();
		client.use();
	}
	
	public void use(){
		Component component=new CompositeComponent();
		Component c1=new PrimitiveComponent1();
		Component c2=new PrimitiveComponent2();
		Component c3=new PrimitiveComponent1();
		Component c4=new PrimitiveComponent2();
		
		Component c=new CompositeComponent();
		c.add(c1);
		c.add(c2);
		
		component.add(c1);
		component.add(c2);
		component.add(c3);
		component.add(c4);
		component.add(c);
		
		component.operation();
		
	}

}
