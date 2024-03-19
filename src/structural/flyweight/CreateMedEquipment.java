package structural.flyweight;

public class CreateMedEquipment {
    public void performDiagnosis(String animalId, String equipmentType) {
        MedicalEquipment equipment = MedicalEquipmentFactory.getMedicalEquipment(equipmentType);
        equipment.diagnose(animalId);
    }
}
