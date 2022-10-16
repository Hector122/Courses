package behavioral.strategy.cameraapp.share;

import behavioral.strategy.cameraapp.share.ShareStrategy;

public class TxtShare implements ShareStrategy {
    @Override
    public void shared() {
        System.out.println("Shred by Txt message.");
    }
}
