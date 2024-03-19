package structural.proxy;

import java.util.List;

public class RealAnimalMedicalRecords implements AnimalMedicalRecords{
    private List<String> records;

    public RealAnimalMedicalRecords(List<String> records) {
        this.records = records;
    }

    @Override
    public List<String> getRecords() {
        return records;
    }
}
