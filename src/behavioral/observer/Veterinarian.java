package behavioral.observer;

public class Veterinarian implements HealthObserver {
    private String name;

    public Veterinarian(String name) {
        this.name = name;
    }

    @Override
    public void update(String animalId, String healthStatus) {
        System.out.println("Veterinarian " + name + " received health status update for animal " + animalId + ": " + healthStatus);
    }
}
