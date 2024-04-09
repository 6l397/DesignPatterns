package behavioral.chainOfResponsibility;

public class Therapist implements TreatmentHandler {
    private TreatmentHandler nextHandler;

    @Override
    public void handleTreatmentRequest(AnimalTreatmentRequest request) {
        if (request.getTreatmentType().equals("therapy")) {
            System.out.println("Therapist is treating the animal.");
        } else if (nextHandler != null) {
            nextHandler.handleTreatmentRequest(request);
        }
    }

    public void setNextHandler(TreatmentHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}

