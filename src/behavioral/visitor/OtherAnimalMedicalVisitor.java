package behavioral.visitor;

public class OtherAnimalMedicalVisitor implements AnimalVisitor {
    @Override
    public void visit(AnimalV animal) {
        System.out.println("Medical checkup for unknown animal: Perform general health assessment.");
    }
}