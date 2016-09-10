package visitor.pattern;

public class TransChecker extends Checker{
	public void check(Transition t){
		System.out.println("It's a Transition");
	}

}
