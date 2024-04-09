package behavioral.strategy;

public class CatFeedingStrategy implements FeedingStrategy {
    @Override
    public void feedAnimal() {
        System.out.println("feeding the cat with cat food.");
    }
}