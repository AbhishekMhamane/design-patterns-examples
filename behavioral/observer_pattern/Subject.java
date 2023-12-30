package behavioral.observer_pattern;

public interface Subject {

    void registerObeserver(Observer observer);
    void unregisterObeserver(Observer observer);
    void notifyObservers();
    
}