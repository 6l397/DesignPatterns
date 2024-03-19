package structural.proxy;

import java.util.List;

public class AccessControlProxy implements AnimalMedicalRecords{
    private RealAnimalMedicalRecords realRecords;
    private boolean isAdmin;

    public AccessControlProxy(List<String> records, boolean isAdmin) {
        this.realRecords = new RealAnimalMedicalRecords(records);
        this.isAdmin = isAdmin;
    }

    @Override
    public List<String> getRecords() {
        if (isAdmin) {
            return realRecords.getRecords();
        } else {
            throw new UnsupportedOperationException("Access denied! Only admins can access the records.");
        }
    }
}
