package structural.facade;

import structural.proxy.AccessControlProxy;
import structural.proxy.AnimalMedicalRecords;

import java.util.List;

public class AnimalMedicalPassportFacade {
    private AnimalMedicalRecords medicalRecords;

    public AnimalMedicalPassportFacade() {
        List<String> records = List.of("Record 1", "Record 2", "Record 3");
        this.medicalRecords = new AccessControlProxy(records, true);
    }

    public List<String> getMedicalRecords() {
        return medicalRecords.getRecords();
    }
}
