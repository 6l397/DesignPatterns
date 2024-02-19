package creational.singleton;

import creational.factory.Animal;

public class VeterinaryClinic {
    private static VeterinaryClinic instance;

    private VeterinaryClinic() {}

    public static VeterinaryClinic getInstance() {
        if (instance == null) {
            instance = new VeterinaryClinic();
        }
        return instance;
    }

    public void treatAnimal(Animal animal) {
        System.out.println("Treatment of the animal.");
        animal.makeSound();
    }
}
