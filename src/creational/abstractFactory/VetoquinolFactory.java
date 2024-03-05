package creational.abstractFactory;

public class VetoquinolFactory extends AbstractFactory {
    @Override
    public DrugManufacturer createManufacturer() {
        return new Vetoquinol();
    }

    @Override
    public Medicals createMedicine() {
        return new Ibuprofen();
    }
}
