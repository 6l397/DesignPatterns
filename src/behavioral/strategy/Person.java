package behavioral.strategy;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void feedAnimal(FeedingStrategy feedingStrategy) {
        System.out.print(name + " is ");
        if (feedingStrategy != null) {
            feedingStrategy.feedAnimal();
        } else {
            System.out.println("No feeding strategy set.");
        }
    }
}
