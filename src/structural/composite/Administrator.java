package structural.composite;

public class Administrator implements MedicalStaff{
    @Override
    public void performDuties() {
        System.out.println("Administrator is managing appointments.");
    }
}
