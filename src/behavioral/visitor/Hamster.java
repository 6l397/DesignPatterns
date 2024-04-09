package behavioral.visitor;

public class Hamster extends AnimalV {
    @Override
    public void accept(AnimalVisitor visitor) {
        visitor.visit(this);
    }
}
