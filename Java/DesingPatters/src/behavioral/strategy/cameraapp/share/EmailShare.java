package behavioral.strategy.cameraapp.share;

public class EmailShare implements ShareStrategy {
    @Override
    public void shared() {
        System.out.println("Share by email, Very fast.");
    }
}
