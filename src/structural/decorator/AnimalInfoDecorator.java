package structural.decorator;

public class AnimalInfoDecorator implements ClientProfile {
    private ClientProfile profile;
    private String animalInfo;

    public AnimalInfoDecorator(ClientProfile profile, String animalInfo) {
        this.profile = profile;
        this.animalInfo = animalInfo;
    }

    @Override
    public String getBasicInfo() {
        return profile.getBasicInfo() + "\nAnimal Info: " + animalInfo;
    }
}
