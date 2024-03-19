package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class VetClinic implements MedicalStaff{
    private List<MedicalStaff> staff;

    public VetClinic() {
        this.staff = new ArrayList<>();
    }

    public void addStaff(MedicalStaff member) {
        staff.add(member);
    }

    public void removeStaff(MedicalStaff member) {
        staff.remove(member);
    }

    @Override
    public void performDuties() {
        for (MedicalStaff member : staff) {
            member.performDuties();
        }
    }
}
