package state.pattern;

public class GumballMachine {

	State soldOutState;
	State noQuarterState;
	State hasQuarterState;
	State soldState;
	State winnerState;
	
	State state=soldOutState;
	int count=0;
	
	public GumballMachine(int count){
		soldOutState=new SoldOutState(this);
		noQuarterState=new NoQuarterState(this);
		hasQuarterState=new HasQuarterState(this);
		soldState=new SoldState(this);
		this.count=count;
		if (count>0){
			state=noQuarterState;
		}
	}
	
	public void insertQuarter(){
		state.insertQuarter();
	}
	
	public void ejectQuarter(){
		state.ejectQuarter();
	}
	
	public void turnCrank(){
		state.turnCrank();
	}

	public void dispense() {
		state.dispense();
	}
	public void setState(State state){
		this.state=state;
	}
	public void releaseBall(){
		System.out.println("A gumball comes rolling out the slot...");
		if(count!=0){
			count=count-1;
		}
	}

	public State getHasQuarterState() {
		// TODO Auto-generated method stub
		return hasQuarterState;
	}

	public State getNoQuarterState() {
		// TODO Auto-generated method stub
		return noQuarterState;
	}

	public State getSoldState() {
		// TODO Auto-generated method stub
		return soldState;
	}

	public State getSoldOutState() {
		// TODO Auto-generated method stub
		return soldOutState;
	}
	
	public State getWinnerState() {
		// TODO Auto-generated method stub
		return winnerState;
	}

	public int getCount() {
		// TODO Auto-generated method stub
		return count;
	}


}
