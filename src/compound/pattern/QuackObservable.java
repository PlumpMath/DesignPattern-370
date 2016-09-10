package compound.pattern;

public interface QuackObservable {
	void registerObserver(Observer observer);
	void notifyObservers();
}
