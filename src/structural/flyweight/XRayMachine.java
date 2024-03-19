package structural.flyweight;

public class XRayMachine implements MedicalEquipment {
    @Override
    public void diagnose(String animalId) {
        System.out.println("Performing X-Ray diagnosis for animal with ID: " + animalId);
    }
}
