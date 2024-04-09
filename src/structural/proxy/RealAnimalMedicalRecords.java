package structural.proxy;

import structural.facade.Record;
import java.util.List;

public class RealAnimalMedicalRecords implements AnimalMedicalRecords{
    private List<Record> records;

    public RealAnimalMedicalRecords(List<Record> records) {
        this.records = records;
    }

    @Override
    public List<Record> getRecords() {
        return records;
    }
}
