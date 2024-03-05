package creational.abstractFactory;

import creational.abstractFactory.medicals.*;

public class ZoetisFactory extends AbstractFactory{
    @Override
    public Medicals createMedicine(MedicalTypes type) {
        return switch (type) {
            case ALBUTEROL -> new Albuterol();
            case OMEPRAZOLE -> new Omeprazole();
            default -> throw new IllegalStateException("Unexpected value: " + type);
        };
    }
}
