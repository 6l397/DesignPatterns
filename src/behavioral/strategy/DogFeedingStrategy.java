package behavioral.strategy;

public class DogFeedingStrategy implements FeedingStrategy {
    @Override
    public void feedAnimal() {
        System.out.println("feeding the dog with dog food.");
    }
}
