package compound.pattern;

public class DuckSimulator {
	public static void main(String[] args){
		DuckSimulator simulator=new DuckSimulator();
		AbstractDuckFactory duckFactory=new CountingDuckFactory();
		simulator.simulate(duckFactory);
	}
	void simulate(AbstractDuckFactory duckFactory){
		Quackable mallardDuck=duckFactory.createMallardDuck();
		Quackable redheadDuck=duckFactory.createRedheadDuck();
		Quackable duckCall=duckFactory.createDuckCall();
		Quackable rubberDuck=duckFactory.createrRubberDuck();
		Quackable gooseDuck=new GooseAdapter(new Goose());
		
		System.out.println("\nDuck simulator: with Goose Adapter");
		
		Flock flockOfDucks=new Flock();
		
		flockOfDucks.add(mallardDuck);
		flockOfDucks.add(redheadDuck);
		flockOfDucks.add(duckCall);
		flockOfDucks.add(rubberDuck);
		flockOfDucks.add(gooseDuck);
		
		Flock flockOfMallards=new Flock();
		
		Quackable mallaerdOne=duckFactory.createMallardDuck();
		Quackable mallaerdTwo=duckFactory.createMallardDuck();
		Quackable mallaerdThree=duckFactory.createMallardDuck();
		Quackable mallaerdFour=duckFactory.createMallardDuck();
		
		flockOfMallards.add(mallaerdOne);
		flockOfMallards.add(mallaerdTwo);
		flockOfMallards.add(mallaerdThree);
		flockOfMallards.add(mallaerdFour);
		
		flockOfDucks.add(flockOfMallards);
		
		System.out.println("\nDuck Simulator: With Observer");
		Quackologist quackologist=new Quackologist();
		flockOfDucks.registerObserver(quackologist);
		
		System.out.println("\nDuck simulator: whole Flock Simulation");
		simulate(flockOfDucks);
		
		System.out.println("\nDuck simulator: Mallard Flock Simulation");
		simulate(flockOfMallards);
		
		System.out.println("The duck quacked "+QuackCounter.getQuacks()+" times");
	}
	void simulate(Quackable duck){
		duck.quack();
	}
}
