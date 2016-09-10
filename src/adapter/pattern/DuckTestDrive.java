package adapter.pattern;

public class DuckTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MallardDuck duck=new MallardDuck();
		
		WildTurkey turkey=new WildTurkey();
		Duck turkeyAdapter=new TurkeyAdapter(turkey);
		
		System.out.println("The Turkey say...");
		turkey.gobble();
		turkey.fly();
		
		System.out.println("\nThe Duck says...");
		testDuck(duck);
		
		System.out.println("\nThe TurkeyAdapter says...");
		testDuck(turkeyAdapter);
	}

	private static void testDuck(Duck duck) {
		// TODO Auto-generated method stub
		duck.quack();
		duck.fly();
	}

}
