package structural.adapter;

public class AnimalDataAdapter implements AnimalData{
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
}
