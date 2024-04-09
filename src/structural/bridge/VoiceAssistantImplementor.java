package structural.bridge;

public class VoiceAssistantImplementor implements VirtualAssistantImplementor {
    @Override
    public void fetchData(String animalName) {
        System.out.println("Fetching data from voice assistant service for " + animalName);
    }

    @Override
    public void analyzeData() {
        System.out.println("Analyzing data fetched from voice assistant service");
    }

}
