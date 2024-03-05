package creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class MedicalRecord implements Prototype, Cloneable {
    private String animalName;
    private String diagnosis;
    private List<String> treatments;

    @Override
    public Prototype doClone() {
        try {
            return (MedicalRecord) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
    public void addTreatment(String treatment) {
        if (treatments == null) {
            treatments = new ArrayList<>();
        }
        treatments.add(treatment);
    }

    public List<String> getTreatments() {
        return treatments;
    }

    public void addDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }
    public String getDiagnosis() {
        return diagnosis;
    }
}
