package factory.pattern;

public class ChicagoStyleCheesePizza extends Pizza {
	public ChicagoStyleCheesePizza(){
		name="Chicago style deep dish cheese pizza";
		dough="Extra thick crust dough";
		sauce="plum tomato sauce";
		toppings.add("Shredded Mozzarella Cheese");
	}
	
	public void cut(){
		System.out.println("Cutting the pizza into square slices");
	}
}
