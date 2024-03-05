import creational.abstractFactory.*;
import creational.abstractFactory.medicals.Medicals;
import creational.builder.AnimalMedicalRecordBuilder;
import creational.factory.Animal;
import creational.factory.AnimalFactory;
import creational.prototype.MedicalRecord;
import creational.singleton.VeterinaryClinic;
import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        //Factory
        System.out.println("--------------Factory--------------");
        AnimalFactory animalFactory = new AnimalFactory();
        Animal dog = animalFactory.createAnimal("dog");
        dog.makeSound();

        //Abstract Factory
        System.out.println("---------AbstractFactory---------");
        MedicalsManufacturerFactory manufacturerFactory = new MedicalsManufacturerFactory();
        AbstractFactory vetoquinolFactory = manufacturerFactory.createManufacturer(ManufacturerTypes.VETO);
        AbstractFactory zoetisFactory = manufacturerFactory.createManufacturer(ManufacturerTypes.ZOET);

        Medicals paracetamol = vetoquinolFactory.createMedicine(MedicalTypes.PARACETAMOL);
        Medicals ibuprofen = vetoquinolFactory.createMedicine(MedicalTypes.IBUPROFEN);
        Medicals albuterol = zoetisFactory.createMedicine(MedicalTypes.ALBUTEROL);
        Medicals omeprazole = zoetisFactory.createMedicine(MedicalTypes.OMEPRAZOLE);

        System.out.println("Vetoquinol Factory products:");
        System.out.println(paracetamol.getName());
        System.out.println(ibuprofen.getName());

        System.out.println("\nZoetis Factory products:");
        System.out.println(albuterol.getName());
        System.out.println(omeprazole.getName());

        //Singleton
        System.out.println("-------------Singleton-------------");
        VeterinaryClinic clinic1 = VeterinaryClinic.getInstance();
        VeterinaryClinic clinic2 = VeterinaryClinic.getInstance();
        System.out.println(clinic1 == clinic2); //true or faulse

        // Prototype
        System.out.println("-------------Prototype-------------");

        MedicalRecord originalRecord = new MedicalRecord();
        originalRecord.addDiagnosis("Threat of flu");
        originalRecord.addTreatment("Taking antibiotics");
        originalRecord.addTreatment("Bed mode");

        MedicalRecord clonedRecord = (MedicalRecord) originalRecord.doClone();

        System.out.println("Original medical record:");
        System.out.println("Diagnosis: " + originalRecord.getDiagnosis());
        System.out.println("Treatment:");
        for (String treatment : originalRecord.getTreatments()) {
            System.out.println("- " + treatment);
        }

        System.out.println("*Cloned medical record:");
        System.out.println("Diagnosis: " + clonedRecord.getDiagnosis());
        System.out.println("Treatment:");
        for (String treatment : clonedRecord.getTreatments()) {
            System.out.println("- " + treatment);
        }

        // Builder
        System.out.println("--------------Builder--------------");
        AnimalMedicalRecordBuilder builder = new AnimalMedicalRecordBuilder();
        MedicalRecord medicalRecord = builder
                .addVaccination("Rabies vaccine", LocalDate.of(2024, 3, 5), 0.21)
                .addDiagnosis("Threat of flu", "Taking antibiotics", "Bed mode")
                .build();
        System.out.println("Medical Record:");
        System.out.println("Diagnosis: " + medicalRecord.getDiagnosis());
        System.out.println("Treatment:");
        for (String treatment : medicalRecord.getTreatments()) {
            System.out.println("- " + treatment);
        }
        System.out.println("Vaccinations:");
        for (String vaccination : medicalRecord.getVaccinations()) {
            System.out.println("- " + vaccination);
        }
    }
}