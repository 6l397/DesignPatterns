package structural.adapter;

public class CatHotel implements AnimalData {
    private String name;
    private int age;
    private String breed;
    private double temperatureInFahrenheit;

    public CatHotel(String name, int age, String breed, double temperatureInFahrenheit) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.temperatureInFahrenheit = temperatureInFahrenheit;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getBreed() {
        return breed;
    }

    public double getTemperatureInFahrenheit() {
        return temperatureInFahrenheit;
    }

    @Override
    public double getTemperature() {
        return getTemperatureInFahrenheit();
    }
}
