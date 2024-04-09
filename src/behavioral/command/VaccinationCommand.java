package behavioral.command;

public class VaccinationCommand implements Command {
    private String animalId;
    private String vaccineType;

    public VaccinationCommand(String animalId, String vaccineType) {
        this.animalId = animalId;
        this.vaccineType = vaccineType;
    }

    @Override
    public void execute() {
        System.out.println("Scheduling vaccination for animal " + animalId + " with vaccine type " + vaccineType);
    }
}