package behavioral.memento;

public class CareTaker {
    private AnimalMemento memento;

    // Зберігання стану тварини
    public void saveAnimalState(AnimalM animal) {
        this.memento = animal.saveState();
    }

    // Відновлення стану тварини
    public void restoreAnimalState(AnimalM animal) {
        if (memento != null) {
            animal.restoreState(memento);
        }
    }
}
