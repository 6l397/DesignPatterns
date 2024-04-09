package structural.composite;

public class Nurse implements MedicalStaff {
    @Override
    public void performDuties() {
        System.out.println("Nurse is administering medication to the animal.");
    }
}