package compound.pattern;

import java.util.ArrayList;
import java.util.Iterator;

public class Flock implements Quackable{
	public ArrayList quackers=new ArrayList();
	
	public void add(Quackable quacker){
		quackers.add(quacker);
	}
	@Override
	public void quack() {
		// TODO Auto-generated method stub
		Iterator iterator=quackers.iterator();
		while(iterator.hasNext()){
			Quackable quacker=(Quackable) iterator.next();
			quacker.quack();
		}
	}
	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		
	}

	public void registerObserver(Observer observer) {
		Iterator iterator=quackers.iterator();
		while(iterator.hasNext()){
			Quackable duck=(Quackable) iterator.next();
			duck.registerObserver(observer);
		}
	}

}
