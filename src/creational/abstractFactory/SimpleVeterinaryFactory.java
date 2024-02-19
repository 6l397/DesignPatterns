package creational.abstractFactory;

import creational.factory.Animal;
import creational.factory.Dog;

public class SimpleVeterinaryFactory implements VeterinaryFactory {
    @Override
    public Animal createAnimal() {
        return new Dog();
    }

    @Override
    public VeterinaryItem createItem() {
        return new Medicine();
    }
}
