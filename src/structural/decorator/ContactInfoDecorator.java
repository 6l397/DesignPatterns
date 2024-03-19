package structural.decorator;

public class ContactInfoDecorator implements ClientProfile {
    private ClientProfile profile;
    private String contactInfo;

    public ContactInfoDecorator(ClientProfile profile, String contactInfo) {
        this.profile = profile;
        this.contactInfo = contactInfo;
    }

    @Override
    public String getBasicInfo() {
        return profile.getBasicInfo() + "\nContact Info: " + contactInfo;
    }
}
