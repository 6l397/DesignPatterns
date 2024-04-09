package behavioral.observer;

interface HealthMonitoringSystem {
    void registerObserver(HealthObserver observer);
    void removeObserver(HealthObserver observer);
    void notifyObservers();
}
