package behavioral.visitor;

public class BirdMedicalVisitor implements AnimalVisitor {
    @Override
    public void visit(AnimalV animal) {
        if (animal instanceof Bird) {
            Bird bird = (Bird) animal;
            System.out.println("Medical checkup for bird: Check wings, beak, and respiratory system.");
        } else {
            System.out.println("Bird medical visitor can only visit birds.");
        }
    }
}