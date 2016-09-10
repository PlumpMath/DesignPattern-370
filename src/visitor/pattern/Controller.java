package visitor.pattern;

public class Controller {

	public StateDiagram diagram;
	public Controller(){
		diagram=new StateDiagram();
	}
	public void use(){
		Checker cState=new StateChecker();
		Checker cTrans=new TransChecker();
		
		State s1=new State();
		State s2=new State();
		
		Transition t1=new Transition();
		Transition t2=new Transition();
		Transition t3=new Transition();
		
		diagram.add(s1);
		diagram.add(s2);
		diagram.add(t1);
		diagram.add(t2);
		diagram.add(t3);
	
		System.out.println("Check state");
		diagram.accept(cState);
		
		System.out.println("Check Transition");
		diagram.accept(cTrans);
	}
}
