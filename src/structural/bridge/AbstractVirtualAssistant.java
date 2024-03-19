package structural.bridge;

abstract class AbstractVirtualAssistant implements VirtualAssistant{
    protected VirtualAssistantImplementor implementor;

    public AbstractVirtualAssistant(VirtualAssistantImplementor implementor) {
        this.implementor = implementor;
    }

    @Override
    public void provideInformation(String animalName) {
        implementor.fetchData(animalName);
        implementor.analyzeData();
    }

    @Override
    public abstract void giveAdvice();
}
