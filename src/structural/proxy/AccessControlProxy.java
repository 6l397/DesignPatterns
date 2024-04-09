package structural.proxy;

import structural.facade.Record;

import java.util.List;

public class AccessControlProxy implements AnimalMedicalRecords{
    private RealAnimalMedicalRecords realRecords;
    private boolean isAdmin;

    public AccessControlProxy(List<structural.facade.Record> records, boolean isAdmin) {
        this.realRecords = new RealAnimalMedicalRecords(records);
        this.isAdmin = isAdmin;
    }

    @Override
    public List<Record> getRecords() {
        if (isAdmin) {
            return realRecords.getRecords();
        } else {
            throw new UnsupportedOperationException("Access denied! Only admins can access the records.");
        }
    }
}
