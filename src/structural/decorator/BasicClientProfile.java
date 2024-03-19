package structural.decorator;

public class BasicClientProfile implements ClientProfile {
    private String basicInfo;

    public BasicClientProfile(String basicInfo) {
        this.basicInfo = basicInfo;
    }

    @Override
    public String getBasicInfo() {
        return basicInfo;
    }
}
