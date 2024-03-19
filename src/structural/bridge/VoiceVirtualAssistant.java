package structural.bridge;

public class VoiceVirtualAssistant extends AbstractVirtualAssistant{
    public VoiceVirtualAssistant(VirtualAssistantImplementor implementor) {
        super(implementor);
    }

    @Override
    public void giveAdvice() {
        System.out.println("Providing advice based on data fetched by the voice assistant");
    }
}
