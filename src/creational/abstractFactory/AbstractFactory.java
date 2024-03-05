package creational.abstractFactory;

import creational.abstractFactory.medicals.Medicals;

public abstract class AbstractFactory {
    public abstract Medicals createMedicine (MedicalTypes type);
}
