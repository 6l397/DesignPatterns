package behavioral.state;

public class UnderTreatmentState implements HealthState {
    @Override
    public void feed() {
        System.out.println("Feeding an animal under treatment.");
    }

    @Override
    public void treat() {
        System.out.println("Animal is already under treatment.");
    }
}
