package behavioral.command;

public class ExaminationCommand implements Command {
    private String animalId;

    public ExaminationCommand(String animalId) {
        this.animalId = animalId;
    }

    @Override
    public void execute() {
        System.out.println("Performing examination for animal " + animalId);
    }
}