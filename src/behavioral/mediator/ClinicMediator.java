package behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class ClinicMediator {
    private List<DoctorM> doctors;

    public ClinicMediator() {
        this.doctors = new ArrayList<>();
    }

    public void registerDoctorM(DoctorM doctorM) {
        doctors.add(doctorM);
    }

    public void receiveRequest(Client client) {
        System.out.println("Mediator receives a request from client: " + client.getName());
        DoctorM availableDoctorM = findAvailableDoctorM();
        if (availableDoctorM != null) {
            System.out.println("Mediator assigns client " + client.getName() + " to Doctor " + availableDoctorM.getName());
            availableDoctorM.handleRequest(client);
        } else {
            System.out.println("No available doctors to handle the request.");
        }
    }
    private DoctorM findAvailableDoctorM() {
        for (DoctorM doctorM : doctors) {
            if (doctorM.isAvailable()) {
                return doctorM;
            }
        }
        return null;
    }
}
