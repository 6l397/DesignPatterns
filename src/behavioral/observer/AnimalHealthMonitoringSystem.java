package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class AnimalHealthMonitoringSystem implements HealthMonitoringSystem {
    private List<HealthObserver> observers;
    private String animalId;
    private String healthStatus;

    public AnimalHealthMonitoringSystem(String animalId) {
        this.observers = new ArrayList<>();
        this.animalId = animalId;
        this.healthStatus = "Healthy";
    }

    @Override
    public void registerObserver(HealthObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(HealthObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (HealthObserver observer : observers) {
            observer.update(animalId, healthStatus);
        }
    }

    public void setHealthStatus(String healthStatus) {
        this.healthStatus = healthStatus;
        notifyObservers();
    }
}
