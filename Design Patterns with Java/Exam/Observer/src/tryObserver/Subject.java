package tryObserver;

public abstract class Subject {

	abstract void register(Observer o);
	abstract void unregister(Observer o);
	abstract void notifyObservers();
}
