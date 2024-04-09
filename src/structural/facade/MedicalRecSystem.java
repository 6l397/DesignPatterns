package structural.facade;

class MedicalRecSystem {
    public void saveMedicalRec(String animalId, String medicalData) {
        System.out.println("Saving medical record for animal with ID: " + animalId);
    }

    public String getMedicalRec(String animalId) {
        System.out.println("Retrieving medical record for animal with ID: " + animalId);
        return "Medical record data for animal with ID " + animalId;
    }
}
