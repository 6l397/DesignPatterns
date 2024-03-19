package structural.adapter;

public class CatHotel implements AnimalData{
    private String name;
    private int age;
    private String breed;

    public CatHotel(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
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
}
