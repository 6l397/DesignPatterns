package structural.bridge;

public class ChatbotVirtualAssistant extends AbstractVirtualAssistant {
    public ChatbotVirtualAssistant(VirtualAssistantImplementor implementor) {
        super(implementor);
    }

    @Override
    public void giveAdvice() {
        System.out.println("Providing advice based on data fetched by the chatbot assistant");
    }
}
