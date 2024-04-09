package behavioral.templateMethod;

public class DogTreatment extends AnimalTreatment {

    @Override
    void preparePatient() {
        System.out.println("Preparing the dog for treatment.");
    }

    @Override
    void diagnose() {
        System.out.println("Diagnosing the dog's condition.");
    }

    @Override
    void administerMedicine() {
        System.out.println("Administering medicine to the dog.");
    }

    @Override
    void followUp() {
        System.out.println("Following up with the dog after treatment.");
    }
    @Override
    void additionalActions() {
        System.out.println("Take vitamins for dogs 'Zesty Paws'.");
    }
}
