package structural.facade;

class VaccinationSystem {
    public void scheduleVaccination(String animalId, String vaccineType) {
        System.out.println("Scheduling vaccination for animal with ID: " + animalId + ", Vaccine Type: " + vaccineType);
    }

    public void cancelVaccination(String animalId, String vaccineType) {
        System.out.println("Cancelling vaccination for animal with ID: " + animalId + ", Vaccine Type: " + vaccineType);
    }
}