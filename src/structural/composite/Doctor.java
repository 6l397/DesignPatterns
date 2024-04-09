package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Doctor implements MedicalStaff {
    private String name;
    private List<MedicalStaff> nurses;

    public Doctor(String name) {
        this.name = name;
        this.nurses = new ArrayList<>();
    }

    public void addNurse(MedicalStaff nurse) {
        nurses.add(nurse);
    }

    public void removeNurse(MedicalStaff nurse) {
        nurses.remove(nurse);
    }

    @Override
    public void performDuties() {
        System.out.println("Doctor " + name + " is examining the animal.");
        for (MedicalStaff nurse : nurses) {
            nurse.performDuties();
        }
    }
}