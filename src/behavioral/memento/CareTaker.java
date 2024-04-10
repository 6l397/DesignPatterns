package behavioral.memento;

public class CareTaker {
    private AnimalMemento memento;

    public void saveAnimalState(AnimalM animal) {
        this.memento = animal.saveState();
    }

    public void restoreAnimalState(AnimalM animal) {
        if (memento != null) {
            animal.restoreState(memento);
        }
    }
}
