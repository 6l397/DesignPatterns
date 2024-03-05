package creational.abstractFactory;

import creational.abstractFactory.medicals.*;

public class VetoquinolFactory extends AbstractFactory {
    @Override
    public Medicals createMedicine(MedicalTypes type) {
        return switch (type) {
            case PARACETAMOL -> new Paracetamol();
            case IBUPROFEN -> new Ibuprofen();
            default -> throw new IllegalStateException("Unexpected value: " + type);
        };
    }
}
