package behavioral.chainOfResponsibility;

public class VaccinationSpecialist implements TreatmentHandler {
    private TreatmentHandler nextHandler;

    @Override
    public void handleTreatmentRequest(AnimalTreatmentRequest request) {
        if (request.getTreatmentType().equals("vaccination")) {
            System.out.println("Vaccination specialist is administering vaccine to the animal.");
        } else if (nextHandler != null) {
            nextHandler.handleTreatmentRequest(request);
        } else {
            System.out.println("No handler available for vaccination.");
        }
    }

    public void setNextHandler(TreatmentHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}