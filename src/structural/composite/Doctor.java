package structural.composite;

public class Doctor implements MedicalStaff{
    @Override
    public void performDuties() {
        System.out.println("Doctor is examining the animal.");
    }
}
