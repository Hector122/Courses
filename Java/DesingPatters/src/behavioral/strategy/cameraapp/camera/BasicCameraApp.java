package behavioral.strategy.cameraapp.camera;

import behavioral.strategy.cameraapp.PhoneCameraApp;
import behavioral.strategy.cameraapp.share.ShareStrategy;

public class BasicCameraApp extends PhoneCameraApp {
    @Override
    public void edit() {
        System.out.println("Edit from basic Camera! not bad");
    }
}
