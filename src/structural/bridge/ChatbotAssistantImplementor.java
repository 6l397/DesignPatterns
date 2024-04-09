package structural.bridge;

public class ChatbotAssistantImplementor implements VirtualAssistantImplementor {
    @Override
    public void fetchData(String animalName) {
        System.out.println("Fetching data from chatbot service for " + animalName);
    }

    @Override
    public void analyzeData() {
        System.out.println("Analyzing data fetched from chatbot service");
    }
}
