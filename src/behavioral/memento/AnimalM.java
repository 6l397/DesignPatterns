package behavioral.memento;

public class AnimalM {
    private String name;
    private String healthStatus;

    public AnimalM(String name) {
        this.name = name;
        this.healthStatus = "Healthy";
    }

    public AnimalMemento saveState() {
        return new AnimalMemento(this.healthStatus);
    }

    public void restoreState(AnimalMemento memento) {
        this.healthStatus = memento.getHealthStatus();
    }

    public void performMedicalProcedure(String procedure) {
        this.healthStatus = "Undergoing " + procedure;
    }

    public String getName() {
        return name;
    }

    public String getHealthStatus() {
        return healthStatus;
    }
}
