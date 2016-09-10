package template.pattern;

public abstract class CaffeineBeverage {
	final void prepareRecipe(){
		boilWater();
		brew();
		pourInCup();
		if(customerWantsCondiments()){
			addCondiments();
		}
	}
	 boolean customerWantsCondiments() {
		// TODO Auto-generated method stub
		return true;
	}
	abstract void addCondiments();
	abstract void brew();
	void boilWater(){
		System.out.println("Boilling water");
	}
	void pourInCup(){
		System.out.println("pouring into cup");
	}
}
