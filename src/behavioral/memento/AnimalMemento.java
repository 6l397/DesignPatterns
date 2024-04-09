package behavioral.memento;

public class AnimalMemento {
    private String healthStatus;

    public AnimalMemento(String healthStatus) {
        this.healthStatus = healthStatus;
    }

    public String getHealthStatus() {
        return healthStatus;
    }
}
