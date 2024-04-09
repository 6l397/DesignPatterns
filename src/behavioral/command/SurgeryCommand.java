package behavioral.command;

public class SurgeryCommand implements Command {
    private String animalId;
    private String surgeryType;

    public SurgeryCommand(String animalId, String surgeryType) {
        this.animalId = animalId;
        this.surgeryType = surgeryType;
    }

    @Override
    public void execute() {
        System.out.println("Scheduling surgery for animal " + animalId + " - " + surgeryType);
    }
}
