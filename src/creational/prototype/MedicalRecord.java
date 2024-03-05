package creational.prototype;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MedicalRecord implements Prototype, Cloneable {
    private String diagnosis;
    private List<String> treatments;
    private List<String> vaccinations; // Додайте список для зберігання інформації про вакцинацію

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

    public void addVaccination(String vaccine, LocalDate date, double dose) {
        if (vaccinations == null) {
            vaccinations = new ArrayList<>();
        }
        String vaccinationInfo = String.format("%s - %s, dose: %.2f", vaccine, date.toString(), dose);
        vaccinations.add(vaccinationInfo);
    }

    // Додайте метод для отримання інформації про вакцинацію
    public List<String> getVaccinations() {
        return vaccinations;
    }
}
