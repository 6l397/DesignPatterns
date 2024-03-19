package structural.bridge;

public class ChatbotAssistantImplementor implements VirtualAssistantImplementor {
    @Override
    public void fetchData(String animalName) {
        // Connect to chatbot service and fetch data about the animal
        System.out.println("Fetching data from chatbot service for " + animalName);
    }

    @Override
    public void analyzeData() {
        // Analyze data fetched from the chatbot service
        System.out.println("Analyzing data fetched from chatbot service");
    }
}
