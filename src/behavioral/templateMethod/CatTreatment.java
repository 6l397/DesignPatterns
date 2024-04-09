package behavioral.templateMethod;

public class CatTreatment extends AnimalTreatment {

    @Override
    void preparePatient() {
        System.out.println("Preparing the cat for treatment.");
    }

    @Override
    void diagnose() {
        System.out.println("Diagnosing the cat's condition.");
    }

    @Override
    void administerMedicine() {
        System.out.println("Administering medicine to the cat.");
    }

    @Override
    void followUp() {
        System.out.println("Following up with the cat after treatment.");
    }

    @Override
    void additionalActions() {
        System.out.println("Take vitamins for cats 'Dolfos CardioDol'.");
    }
}