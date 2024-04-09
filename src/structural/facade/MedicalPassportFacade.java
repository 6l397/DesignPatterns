package structural.facade;

import structural.proxy.AccessControlProxy;
import structural.proxy.AnimalMedicalRecords;

public class MedicalPassportFacade {
    private AnimalMedicalPassport animalMedicalPassport;
    private MedicalRecSystem medicalRecSystem;
    private VaccinationSystem vaccinationSystem;

    public MedicalPassportFacade() {
        this.medicalRecSystem = new MedicalRecSystem();
        this.vaccinationSystem = new VaccinationSystem();
    }

    public void createMedicalPassport(String animalId) {
        this.animalMedicalPassport = new AnimalMedicalPassport(animalId);
    }

    public void createVisitRecord(String date, String description) {
        if (animalMedicalPassport != null) {
            Record record = new Record(date, description);
            animalMedicalPassport.addRecord(record);
        }
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
    public AnimalMedicalRecords getMedicalRecordsProxy() {
        return new AccessControlProxy(animalMedicalPassport.getMedicalRecords(), true);
    }
}
