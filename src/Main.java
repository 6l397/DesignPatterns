import creational.abstractFactory.*;
import creational.abstractFactory.medicals.Medicals;
import creational.builder.AnimalMedicalRecordBuilder;
import creational.factory.Animal;
import creational.factory.AnimalFactory;
import creational.prototype.MedicalRecord;
import creational.singleton.VeterinaryClinic;
import structural.adapter.AnimalData;
import structural.adapter.AnimalDataAdapter;
import structural.adapter.CatHotel;
import structural.bridge.*;
import structural.composite.Administrator;
import structural.composite.Doctor;
import structural.composite.Nurse;
import structural.composite.VetClinic;
import structural.decorator.AnimalInfoDecorator;
import structural.decorator.BasicClientProfile;
import structural.decorator.ClientProfile;
import structural.decorator.ContactInfoDecorator;
import structural.facade.AnimalMedicalPassport;
import structural.facade.AnimalMedicalPassportFacade;
import structural.flyweight.CreateMedEquipment;

import java.time.LocalDate;
import java.util.List;


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

        // Adapter
        System.out.println("--------------Adapter--------------");
        CatHotel externalAnimalData = new CatHotel("Snowy", 5, "Bengal cat");

        AnimalData animalData = new AnimalDataAdapter(externalAnimalData);

        System.out.println("Name: " + animalData.getName());
        System.out.println("Age: " + animalData.getAge());
        System.out.println("Breed: " + animalData.getBreed());

        // Bridge
        System.out.println("--------------Bridge---------------");
        VirtualAssistantImplementor chatbotImplementor = new ChatbotAssistantImplementor();
        VirtualAssistantImplementor voiceImplementor = new VoiceAssistantImplementor();

        VirtualAssistant chatbotAssistant = new ChatbotVirtualAssistant(chatbotImplementor);
        VirtualAssistant voiceAssistant = new VoiceVirtualAssistant(voiceImplementor);

        chatbotAssistant.provideInformation("Dog");
        chatbotAssistant.giveAdvice();

        voiceAssistant.provideInformation("Cat");
        voiceAssistant.giveAdvice();

        // Composite
        System.out.println("-------------Composite-------------");
        Doctor doctor1 = new Doctor();
        Nurse nurse1 = new Nurse();
        Administrator admin1 = new Administrator();

        VetClinic clinic = new VetClinic();
        clinic.addStaff(doctor1);
        clinic.addStaff(nurse1);
        clinic.addStaff(admin1);

        clinic.performDuties();

        // Decorator
        System.out.println("-------------Decorator-------------");
        ClientProfile basicProfile = new BasicClientProfile("Name: Alex Lav\nAddress: 123 Prospect St.");

        ClientProfile profileWithContactInfo = new ContactInfoDecorator(basicProfile, "Phone: 555-1234\nEmail: sasha.lav@google.com");

        ClientProfile profileWithAnimalInfo = new AnimalInfoDecorator(profileWithContactInfo, "Pet: Dog\nBreed: Labrador");

        System.out.println("Client Profile:");
        System.out.println(profileWithAnimalInfo.getBasicInfo());

        // Facade
        System.out.println("--------------Facade---------------");
        AnimalMedicalPassport passport = new AnimalMedicalPassport();

        passport.saveMedicalRec("1", "Medical data for animal 1");
        String medicalRec = passport.getMedicalRec("1");
        System.out.println("Retrieved medical record: " + medicalRec);

        passport.scheduleVaccination("2", "Rabies");
        passport.cancelVaccination("2", "Rabies");

        // Proxy
        System.out.println("---------------Proxy---------------");
        AnimalMedicalPassportFacade facade = new AnimalMedicalPassportFacade();
        List<String> records = facade.getMedicalRecords();
        System.out.println("Medical records: " + records);

        // Flyweight
        System.out.println("-------------Flyweight-------------");

        CreateMedEquipment equipment = new CreateMedEquipment();

        equipment.performDiagnosis("3", "XRay");
        equipment.performDiagnosis("4", "XRay");
    }
}