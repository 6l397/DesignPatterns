package behavioral.mediator;

public class Client {
    private String name;

    public Client(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void makeRequest(ClinicMediator mediator) {
        System.out.println("Client " + name + " makes a request.");
        mediator.receiveRequest(this);
    }
}
