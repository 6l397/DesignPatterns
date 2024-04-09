package behavioral.state;

public class SickState implements HealthState {
    @Override
    public void feed() {
        System.out.println("Feeding a sick animal.");
    }

    @Override
    public void treat() {
        System.out.println("Applying treatment to a sick animal.");
    }
}
