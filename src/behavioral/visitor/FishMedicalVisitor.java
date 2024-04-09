package behavioral.visitor;

public class FishMedicalVisitor implements AnimalVisitor {
    @Override
    public void visit(AnimalV animal) {
        if (animal instanceof Fish) {
            Fish fish = (Fish) animal;
            System.out.println("Medical checkup for fish: Check fins, gills, and swimming ability.");
        } else {
            System.out.println("Fish medical visitor can only visit fish.");
        }
    }
}