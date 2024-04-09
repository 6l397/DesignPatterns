package behavioral.memento;

public class AnimalM {
    private String name;
    private String healthStatus;

    public AnimalM(String name) {
        this.name = name;
        this.healthStatus = "Healthy"; // Початковий стан - здорова тварина
    }

    // Збереження поточного стану тварини в Memento
    public AnimalMemento saveState() {
        return new AnimalMemento(this.healthStatus);
    }

    // Відновлення стану тварини з Memento
    public void restoreState(AnimalMemento memento) {
        this.healthStatus = memento.getHealthStatus();
    }

    // Зміна стану тварини (наприклад, лікування)
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
