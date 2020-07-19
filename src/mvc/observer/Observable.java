package mvc.observer;

public interface Observable {

    void addObserver(Observer observer);

    void deleteObserver(Observer observer);

    void notifyObservers();

    void deleteObserver(int index);

}
