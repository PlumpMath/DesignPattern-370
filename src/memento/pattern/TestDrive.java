package memento.pattern;

public class TestDrive {
	public static void main(String args[]){
		WindowsSystem winxp=new WindowsSystem();
		User user=new User();
		
		winxp.setState("works well");
		user.saveMemento(winxp.createMemento());
		
		winxp.setState("something wrong");
		winxp.restoreMemento(user.retrieveMemento()); //restore state
		
		System.out.println("present state: "+winxp.getState());
	}

}
