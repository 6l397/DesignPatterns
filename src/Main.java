import creational.abstractFactory.*;
import creational.builder.AnimalMedicalRecordBuilder;
import creational.factory.Animal;
import creational.factory.AnimalFactory;
import creational.prototype.MedicalRecord;
import creational.singleton.VeterinaryClinic;

public class Main {
    public static void main(String[] args) {
        //Factory
        System.out.println("--------------Factory--------------");
        AnimalFactory animalFactory = new AnimalFactory();
        Animal dog = animalFactory.createAnimal("dog");
        dog.makeSound();

        //Abstract Factory
        System.out.println("----------AbstractFactory----------");
        AbstractFactory zoetisFactory = new ZoetisFactory();
        DrugManufacturer zoetisManufacturer = zoetisFactory.createManufacturer();
        Medicals zoetisMedicine = zoetisFactory.createMedicine();
        System.out.println("Manufacturer: " + zoetisManufacturer.getName());
        System.out.println("Medicine: " + zoetisMedicine.getName());

        AbstractFactory vetoquinolFactory = new VetoquinolFactory();
        DrugManufacturer vetoquinolManufacturer = vetoquinolFactory.createManufacturer();
        Medicals vetoquinolMedicine = vetoquinolFactory.createMedicine();
        System.out.println("Manufacturer: " + vetoquinolManufacturer.getName());
        System.out.println("Medicine: " + vetoquinolMedicine.getName());

        //Singleton
        System.out.println("-------------Singleton-------------");
        VeterinaryClinic clinic1 = VeterinaryClinic.getInstance();
        VeterinaryClinic clinic2 = VeterinaryClinic.getInstance();
        System.out.println(clinic1 == clinic2); //true or faulse

        //Prototype
        System.out.println("-------------Prototype-------------");
        // Створення оригінального медичного запису
        MedicalRecord originalRecord = new MedicalRecord();
        originalRecord.addDiagnosis("Threat of flu");
        originalRecord.addTreatment("Taking antibiotics");
        originalRecord.addTreatment("Bed mode");
        // Клонування медичного запису
        MedicalRecord clonedRecord = (MedicalRecord) originalRecord.doClone();
        // Вивід інформації про оригінальний запис
        System.out.println("Original medical record:");
        System.out.println("Diagnosis: " + originalRecord.getDiagnosis());
        System.out.println("Treatment:");
        for (String treatment : originalRecord.getTreatments()) {
            System.out.println("- " + treatment);
        }
        // Вивід інформації про клонований запис
        System.out.println("*Cloned medical record:");
        System.out.println("Diagnosis: " + clonedRecord.getDiagnosis());
        System.out.println("Treatment:");
        for (String treatment : clonedRecord.getTreatments()) {
            System.out.println("- " + treatment);
        }

        //Builder
        System.out.println("--------------Builder--------------");
        AnimalMedicalRecordBuilder builder = new AnimalMedicalRecordBuilder();
        MedicalRecord medicalRecord = builder
                .addVaccination("Rabies vaccine.")
                .addTreatment("Antibiotic.")
                .build();
    }
}