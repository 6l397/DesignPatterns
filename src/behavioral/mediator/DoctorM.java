package behavioral.mediator;

public class DoctorM {
    private String name;
    private boolean available;

    public DoctorM(String name) {
        this.name = name;
        this.available = true;
    }

    public String getName() {
        return name;
    }

    public boolean isAvailable() {
        return available;
    }

    public void handleRequest(Client client) {
        System.out.println("Doctor " + name + " handles request from client: " + client.getName());
        available = false;
    }

    public void completeRequest() {
        available = true;
    }
}
