package behavioral.templateMethod;

public abstract class AnimalTreatment {

    public void treatAnimal() {
        preparePatient();
        diagnose();
        administerMedicine();
        followUp();
        additionalActions();
    }

    abstract void preparePatient();
    abstract void diagnose();
    abstract void administerMedicine();
    abstract void followUp();
    abstract void additionalActions();
}