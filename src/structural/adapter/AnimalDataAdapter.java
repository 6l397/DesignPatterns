package structural.adapter;

public class AnimalDataAdapter implements AnimalData {
    private CatHotel externalAnimalData;

    public AnimalDataAdapter(CatHotel externalAnimalData) {
        this.externalAnimalData = externalAnimalData;
    }

    @Override
    public String getName() {
        return externalAnimalData.getName();
    }

    @Override
    public int getAge() {
        return externalAnimalData.getAge();
    }

    @Override
    public String getBreed() {
        return externalAnimalData.getBreed();
    }

    public double getTemperatureInCelsius() {
        return (externalAnimalData.getTemperatureInFahrenheit() - 32) * 5 / 9;
    }

    @Override
    public double getTemperature() {
        return getTemperatureInCelsius();
    }
}