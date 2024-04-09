package behavioral.chainOfResponsibility;

public class AnimalTreatmentRequest {
    private String animalId;
    private String treatmentType;

    public AnimalTreatmentRequest(String animalId, String treatmentType) {
        this.animalId = animalId;
        this.treatmentType = treatmentType;
    }

    public String getAnimalId() {
        return animalId;
    }

    public String getTreatmentType() {
        return treatmentType;
    }
}
