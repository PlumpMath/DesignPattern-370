package compound.pattern;

public class MallardDuck implements Quackable{
	Observable observable;
	public MallardDuck(){
		observable=new Observable(this);
	}
	@Override
	public void quack() {
		// TODO Auto-generated method stub
		System.out.println("Quack");
		notifyObservers();
	}
	public void registerObserver(Observer observer){
		observable.registerObserver(observer);
	}
	public void notifyObservers(){
		observable.notifyObservers();
	}
}
