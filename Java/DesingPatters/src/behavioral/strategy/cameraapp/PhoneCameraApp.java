package behavioral.strategy.cameraapp;

import behavioral.strategy.cameraapp.share.ShareStrategy;

public abstract class PhoneCameraApp {
    private ShareStrategy shareStrategy;

    public abstract void edit();

    public void share(){
        shareStrategy.shared();
    }

    public void save() {
        System.out.println("Save picture");
    }

    public void take() {
        System.out.println("Take pic.");
    }

    public void setShareStrategy(ShareStrategy shareStrategy){
        this.shareStrategy = shareStrategy;
    }
}
