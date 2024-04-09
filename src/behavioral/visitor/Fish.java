package behavioral.visitor;

public class Fish extends AnimalV {
    @Override
    public void accept(AnimalVisitor visitor) {
        visitor.visit(this);
    }
}