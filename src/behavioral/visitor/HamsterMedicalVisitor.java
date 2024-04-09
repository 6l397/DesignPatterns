package behavioral.visitor;

public class HamsterMedicalVisitor implements AnimalVisitor {
    @Override
    public void visit(AnimalV animal) {
        if (animal instanceof Hamster) {
            Hamster hamster = (Hamster) animal;
            System.out.println("Medical checkup for hamster: Check teeth, fur, and overall condition.");
        } else {
            System.out.println("Hamster medical visitor can only visit hamsters.");
        }
    }
}