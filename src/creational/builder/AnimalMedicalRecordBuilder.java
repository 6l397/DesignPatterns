package creational.builder;

import creational.prototype.MedicalRecord;

import java.time.LocalDate;

public class AnimalMedicalRecordBuilder {
    private final MedicalRecord medicalRecord;

    public AnimalMedicalRecordBuilder() {
        this.medicalRecord = new MedicalRecord();
    }

    public AnimalMedicalRecordBuilder addVaccination(String vaccine, LocalDate date, double dose) {
        this.medicalRecord.addVaccination(vaccine, date, dose);
        return this;
    }

    public AnimalMedicalRecordBuilder addDiagnosis(String diagnosis, String treatment, String recommendations) {
        this.medicalRecord.addDiagnosis(diagnosis);
        this.medicalRecord.addTreatment(treatment);
        this.medicalRecord.addTreatment(recommendations);
        return this;
    }

    public MedicalRecord build() {
        return this.medicalRecord;
    }
}
