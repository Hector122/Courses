package behavioral.strategy.cameraapp.share;

public class SocialMediaShare implements ShareStrategy{
    @Override
    public void shared() {
        System.out.println("Share in all my social media... bad idea.");
    }
}
