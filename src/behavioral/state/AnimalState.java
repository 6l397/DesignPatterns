package behavioral.state;

public class AnimalState {
    private HealthState healthState;

    public AnimalState() {
        this.healthState = new HealthyState();
    }

    public void setHealthState(HealthState healthState) {
        this.healthState = healthState;
    }

    public void feedAnimal() {
        healthState.feed();
    }

    public void treatAnimal() {
        healthState.treat();
    }
}
