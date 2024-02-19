package creational.prototype;

public class MedicalRecord implements Cloneable {
    @Override
    public MedicalRecord clone() {
        try {
            return (MedicalRecord) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
    public void addTreatment(String treatment) {
    }

    public void addVaccination(String vaccine) {
    }

    public void addDiagnosis(String diagnosis) {
    }
}
