package structural.facade;

public class AnimalMedicalPassport {
    private MedicalRecSystem medicalRecSystem;
    private VaccinationSystem vaccinationSystem;

    public AnimalMedicalPassport() {
        this.medicalRecSystem = new MedicalRecSystem();
        this.vaccinationSystem = new VaccinationSystem();
    }

    public void saveMedicalRec(String animalId, String medicalData) {
        medicalRecSystem.saveMedicalRec(animalId, medicalData);
    }

    public String getMedicalRec(String animalId) {
        return medicalRecSystem.getMedicalRec(animalId);
    }

    public void scheduleVaccination(String animalId, String vaccineType) {
        vaccinationSystem.scheduleVaccination(animalId, vaccineType);
    }

    public void cancelVaccination(String animalId, String vaccineType) {
        vaccinationSystem.cancelVaccination(animalId, vaccineType);
    }
}
