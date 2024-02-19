package creational.abstractFactory;

import creational.factory.Animal;

public interface VeterinaryFactory {
    Animal createAnimal();
    VeterinaryItem createItem();
}
