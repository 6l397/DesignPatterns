package creational.abstractFactory;

class Medicine implements VeterinaryItem {
    @Override
    public void use() {
        System.out.println("Use of medicinal product.");
    }
}
