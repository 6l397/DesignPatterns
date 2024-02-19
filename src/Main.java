import creational.abstractFactory.SimpleVeterinaryFactory;
import creational.abstractFactory.VeterinaryFactory;
import creational.abstractFactory.VeterinaryItem;
import creational.builder.AnimalMedicalRecordBuilder;
import creational.factory.Animal;
import creational.factory.AnimalFactory;
import creational.prototype.MedicalRecord;
import creational.singleton.VeterinaryClinic;

public class Main {
    public static void main(String[] args) {
        //Factory
        AnimalFactory animalFactory = new AnimalFactory();
        Animal dog = animalFactory.createAnimal("dog");
        dog.makeSound();

        //Abstract Factory
        VeterinaryFactory veterinaryFactory = new SimpleVeterinaryFactory();
        Animal cat = veterinaryFactory.createAnimal();
        cat.makeSound();
        VeterinaryItem medicine = veterinaryFactory.createItem();
        medicine.use();

        //Singleton
        VeterinaryClinic clinic1 = VeterinaryClinic.getInstance();
        VeterinaryClinic clinic2 = VeterinaryClinic.getInstance();
        System.out.println(clinic1 == clinic2); //true or faulse

        //Prototype
        MedicalRecord originalRecord = new MedicalRecord();
        MedicalRecord clonedRecord = originalRecord.clone();

        //Builder
        AnimalMedicalRecordBuilder builder = new AnimalMedicalRecordBuilder();
        MedicalRecord medicalRecord = builder
                .addVaccination("Rabies vaccine.")
                .addTreatment("Antibiotic.")
                .build();
    }
}