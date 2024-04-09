package behavioral.strategy;

public class BirdFeedingStrategy implements FeedingStrategy {
    @Override
    public void feedAnimal() {
        System.out.println("feeding the bird with bird seeds.");
    }
}