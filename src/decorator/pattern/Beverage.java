package decorator.pattern;

public abstract class Beverage {
	String description="Unkown berverage";
	public String getDescription(){
		return description;
	}
	
	public abstract double cost();
}
