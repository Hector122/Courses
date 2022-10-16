package behavioral.strategy.cameraapp;

import behavioral.strategy.cameraapp.camera.CameraPlusApp;
import behavioral.strategy.cameraapp.PhoneCameraApp;
import behavioral.strategy.cameraapp.share.EmailShare;
import behavioral.strategy.cameraapp.share.SocialMediaShare;
import behavioral.strategy.cameraapp.share.TxtShare;

import java.util.Scanner;

public class MainDemoPhotoWithPhone {

    public static void main(String[] args) {
        PhoneCameraApp phoneCameraApp = new CameraPlusApp();

        String share = chooseShare();
        switch (share) {
            case "t":
                phoneCameraApp.setShareStrategy(new TxtShare());
                break;
            case "e":
                phoneCameraApp.setShareStrategy(new EmailShare());
                break;
            case "s":
                phoneCameraApp.setShareStrategy(new SocialMediaShare());
                break;
            default:
                System.out.println("Not at option.");
                chooseShare();
        }

        phoneCameraApp.take();
        phoneCameraApp.save();
        phoneCameraApp.edit();
        phoneCameraApp.share();
    }

    public static String chooseShare() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Share with txt (t), email (e), or social media (s)?");
        String choose = scanner.next();
        scanner.close();
        return choose;
    }
}
