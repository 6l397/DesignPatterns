package creational.abstractFactory;

import creational.factory.Animal;
import creational.factory.Cat;

public class SimpleVeterinaryFactory implements VeterinaryFactory {
    @Override
    public Animal createAnimal() {
        return new Cat();
    }

    @Override
    public VeterinaryItem createItem() {
        return new Medicine();
    }
}
