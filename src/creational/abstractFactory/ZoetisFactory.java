package creational.abstractFactory;

public class ZoetisFactory extends AbstractFactory {
    @Override
    public DrugManufacturer createManufacturer() {
        return new Zoetis();
    }

    @Override
    public Medicals createMedicine() {
        return new Paracetamol();
    }
}
