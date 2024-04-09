import behavioral.chainOfResponsibility.*;
import behavioral.command.*;
import behavioral.iterator.Animalt;
import behavioral.iterator.Clinic;
import behavioral.mediator.Client;
import behavioral.mediator.ClinicMediator;
import behavioral.mediator.DoctorM;
import behavioral.memento.AnimalM;
import behavioral.memento.CareTaker;
import behavioral.observer.AnimalHealthMonitoringSystem;
import behavioral.observer.Veterinarian;
import behavioral.state.AnimalState;
import behavioral.state.SickState;
import behavioral.state.UnderTreatmentState;
import behavioral.strategy.*;
import behavioral.templateMethod.AnimalTreatment;
import behavioral.templateMethod.CatTreatment;
import behavioral.templateMethod.DogTreatment;
import behavioral.visitor.*;
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
import structural.facade.MedicalPassportFacade;
import structural.facade.Record;
import structural.flyweight.CreateMedEquipment;
import structural.proxy.AnimalMedicalRecords;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
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
        CatHotel externalAnimalData = new CatHotel("Snowy", 5, "Bengal cat", 100.4);
        AnimalData animalData = new AnimalDataAdapter(externalAnimalData);
        System.out.println("Name: " + animalData.getName());
        System.out.println("Age: " + animalData.getAge());
        System.out.println("Breed: " + animalData.getBreed());
        System.out.println("Temperature: " + animalData.getTemperature());

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
        Administrator admin1 = new Administrator();
        Doctor doctor1 = new Doctor("Dr. Smith");
        doctor1.addNurse(new Nurse());
        doctor1.addNurse(new Nurse());
        Doctor doctor2 = new Doctor("Dr. Johnson");
        doctor2.addNurse(new Nurse());
        doctor2.addNurse(new Nurse());
        VetClinic clinic = new VetClinic();
        clinic.addStaff(admin1);
        clinic.addStaff(doctor1);
        clinic.addStaff(doctor2);
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
        MedicalPassportFacade medicalPassportFacade = new MedicalPassportFacade();
        medicalPassportFacade.createMedicalPassport("123");
        medicalPassportFacade.createVisitRecord("2024-03-30", "Vaccination against rabies");
        medicalPassportFacade.createVisitRecord("2024-04-15", "Examination and treatment");
        medicalPassportFacade.saveMedicalRec("123", "Additional medical data");
        String medicalRec = medicalPassportFacade.getMedicalRec("123");
        System.out.println("Retrieved medical record: " + medicalRec);
        medicalPassportFacade.scheduleVaccination("123", "Flu vaccine");
        medicalPassportFacade.cancelVaccination("123", "Flu vaccine");


        // Proxy
        System.out.println("---------------Proxy---------------");
        AnimalMedicalRecords recordsProxy = medicalPassportFacade.getMedicalRecordsProxy();
        List<Record> records = recordsProxy.getRecords();
        System.out.println("Medical records:");
        for (Record record : records) {
            System.out.println(record);
        }

        // Flyweight
        System.out.println("-------------Flyweight-------------");
        CreateMedEquipment equipment = new CreateMedEquipment();
        equipment.performDiagnosis("3", "XRay");
        equipment.performDiagnosis("4", "XRay");

        // Template Method
        System.out.println("----------Template Method----------");
        AnimalTreatment catTreatment = new CatTreatment();
        System.out.println("Cat Treatment:");
        catTreatment.treatAnimal();
        System.out.println();
        AnimalTreatment dogTreatment = new DogTreatment();
        System.out.println("Dog Treatment:");
        dogTreatment.treatAnimal();

        // Mediator
        System.out.println("--------------Mediator--------------");
        ClinicMediator mediator = new ClinicMediator();
        DoctorM doctor3 = new DoctorM("Dr. Smith");
        DoctorM doctor4 = new DoctorM("Dr. Johnson");
        mediator.registerDoctorM(doctor3);
        mediator.registerDoctorM(doctor4);
        Client client1 = new Client("Alice");
        Client client2 = new Client("Bob");
        client1.makeRequest(mediator);
        client2.makeRequest(mediator);
        doctor3.completeRequest();

        // Observer
        System.out.println("--------------Observer--------------");
        AnimalHealthMonitoringSystem healthMonitoringSystem = new AnimalHealthMonitoringSystem("123");
        Veterinarian vet1 = new Veterinarian("Dr. Smith");
        Veterinarian vet2 = new Veterinarian("Dr. Johnson");
        healthMonitoringSystem.registerObserver(vet1);
        healthMonitoringSystem.registerObserver(vet2);
        healthMonitoringSystem.setHealthStatus("Sick");
        healthMonitoringSystem.removeObserver(vet2);
        healthMonitoringSystem.setHealthStatus("Recovered");

        // Chain of Responsibility
        System.out.println("------Chain of Responsibility------");
        TreatmentHandler therapist = new Therapist();
        TreatmentHandler surgeon = new Surgeon();
        TreatmentHandler vaccinationSpecialist = new VaccinationSpecialist();
        ((Therapist) therapist).setNextHandler(surgeon);
        ((Surgeon) surgeon).setNextHandler(vaccinationSpecialist);
        AnimalTreatmentRequest request1 = new AnimalTreatmentRequest("123", "therapy");
        AnimalTreatmentRequest request2 = new AnimalTreatmentRequest("456", "surgery");
        AnimalTreatmentRequest request3 = new AnimalTreatmentRequest("789", "vaccination");
        AnimalTreatmentRequest request4 = new AnimalTreatmentRequest("999", "dental care");
        therapist.handleTreatmentRequest(request1);
        therapist.handleTreatmentRequest(request2);
        therapist.handleTreatmentRequest(request3);
        therapist.handleTreatmentRequest(request4);

        // Command
        System.out.println("--------------Command---------------");
        MedicalProcedureInvoker invoker = new MedicalProcedureInvoker();
        Command vaccinationCommand = new VaccinationCommand("12", "Rabies");
        invoker.setCommand(vaccinationCommand);
        invoker.executeCommand();
        Command examinationCommand = new ExaminationCommand("34");
        invoker.setCommand(examinationCommand);
        invoker.executeCommand();
        Command surgeryCommand = new SurgeryCommand("56", "Heart surgery");
        invoker.setCommand(surgeryCommand);
        invoker.executeCommand();

        // State
        System.out.println("---------------State----------------");
        AnimalState animalState = new AnimalState();
        animalState.feedAnimal();
        animalState.treatAnimal();
        animalState.setHealthState(new SickState());
        animalState.feedAnimal();
        animalState.treatAnimal();
        animalState.setHealthState(new UnderTreatmentState());
        animalState.feedAnimal();
        animalState.treatAnimal();

        // Iterator
        System.out.println("--------------Iterator--------------");
        Clinic clinic3 = new Clinic();
        clinic3.addAnimalt(new Animalt("Fluffy", "Cat"));
        clinic3.addAnimalt(new Animalt("Buddy", "Dog"));
        clinic3.addAnimalt(new Animalt("Whiskers", "Rabbit"));
        Iterator<Animalt> iterator = clinic3.createIterator();
        while (iterator.hasNext()) {
            Animalt animal = iterator.next();
            System.out.println("Animal: " + animal.getName() + " (Species: " + animal.getSpecies() + ")");
        }

        // Strategy
        System.out.println("--------------Strategy--------------");
        Person person = new Person("Artem");
        person.feedAnimal(new DogFeedingStrategy());
        person.feedAnimal(new BirdFeedingStrategy());
        person.feedAnimal(new CatFeedingStrategy());

        // Memento
        System.out.println("---------------Memento--------------");
        AnimalM dog3 = new AnimalM("Buddy");
        CareTaker caretaker = new CareTaker();
        caretaker.saveAnimalState(dog3);
        dog3.performMedicalProcedure("vaccination");
        System.out.println("Current health status of " + dog3.getName() + ": " + dog3.getHealthStatus());
        caretaker.restoreAnimalState(dog3);
        System.out.println("Health status of " + dog3.getName() + " after restoration: " + dog3.getHealthStatus());

        // Visitor
        System.out.println("---------------Visitor--------------");
        AnimalV bird = new Bird();
        AnimalV fish = new Fish();
        AnimalV hamster = new Hamster();
        AnimalV unknownAnimal = new AnimalV() {
            @Override
            public void accept(AnimalVisitor visitor) {
                visitor.visit(this);
            }
        };

        AnimalVisitor birdVisitor = new BirdMedicalVisitor();
        AnimalVisitor fishVisitor = new FishMedicalVisitor();
        AnimalVisitor hamsterVisitor = new HamsterMedicalVisitor();
        AnimalVisitor otherVisitor = new OtherAnimalMedicalVisitor();

        bird.accept(birdVisitor);
        fish.accept(fishVisitor);
        hamster.accept(hamsterVisitor);
        unknownAnimal.accept(otherVisitor);
    }
}