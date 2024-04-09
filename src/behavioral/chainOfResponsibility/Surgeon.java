package behavioral.chainOfResponsibility;

public class Surgeon implements TreatmentHandler {
    private TreatmentHandler nextHandler;

    @Override
    public void handleTreatmentRequest(AnimalTreatmentRequest request) {
        if (request.getTreatmentType().equals("surgery")) {
            System.out.println("Surgeon is performing surgery on the animal.");
        } else if (nextHandler != null) {
            nextHandler.handleTreatmentRequest(request);
        }
    }

    public void setNextHandler(TreatmentHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
