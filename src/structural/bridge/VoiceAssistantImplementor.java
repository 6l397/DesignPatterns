package structural.bridge;

public class VoiceAssistantImplementor implements VirtualAssistantImplementor {
    @Override
    public void fetchData(String animalName) {
        // Connect to voice assistant service and fetch data about the animal
        System.out.println("Fetching data from voice assistant service for " + animalName);
    }

    @Override
    public void analyzeData() {
        // Analyze data fetched from the voice assistant service
        System.out.println("Analyzing data fetched from voice assistant service");
    }

}
