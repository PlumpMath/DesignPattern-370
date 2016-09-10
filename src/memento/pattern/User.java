package memento.pattern;

public class User {

	private Memento memento;
	public Memento retrieveMemento(){
		return this.memento;
	}
	public void saveMemento(Memento memento){
		this.memento=memento;
		
	}
}
