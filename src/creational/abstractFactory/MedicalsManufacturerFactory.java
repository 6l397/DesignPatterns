package creational.abstractFactory;

public class MedicalsManufacturerFactory {
    public AbstractFactory createManufacturer(ManufacturerTypes type) {
        return switch (type) {
            case VETO -> new VetoquinolFactory();
            case ZOET -> new ZoetisFactory();
        };
    }
}
