package structural.facade;

import java.util.ArrayList;
import java.util.List;

public class AnimalMedicalPassport {
    private String animalId;
    private List<Record> records;

    public AnimalMedicalPassport(String animalId) {
        this.animalId = animalId;
        this.records = new ArrayList<>();
    }

    public void addRecord(Record record) {
        records.add(record);
    }

    public List<Record> getMedicalRecords() {
        return records;
    }

    public String getAnimalId() {
        return animalId;
    }
}
