package creational.builder;

import creational.prototype.MedicalRecord;

public class AnimalMedicalRecordBuilder {
    private final MedicalRecord medicalRecord;

    public AnimalMedicalRecordBuilder() {
        this.medicalRecord = new MedicalRecord();
    }

    public AnimalMedicalRecordBuilder addVaccination(String vaccine) {
        return this;
    }

    public AnimalMedicalRecordBuilder addTreatment(String treatment) {
        return this;
    }

    public MedicalRecord build() {
        return this.medicalRecord;
    }
}
