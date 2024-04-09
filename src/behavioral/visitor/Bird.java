package behavioral.visitor;

public class Bird extends AnimalV {
    @Override
    public void accept(AnimalVisitor visitor) {
        visitor.visit(this);
    }
}