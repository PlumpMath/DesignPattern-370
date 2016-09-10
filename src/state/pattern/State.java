package state.pattern;

public interface State {

	void insertQuarter();
	void ejectQuarter();
	void turnCrank();
	void dispense();
}
