package designpatternpackage.strategyclass;

public abstract class PhoneCameraApp {
    ShareFunctionality shareFunctionality;

    public void setShareStrategy(ShareFunctionality shareFunctionality) {
        this.shareFunctionality = shareFunctionality;
    }

    public void sharePhoto() {
        shareFunctionality.sharePhoto();
    }

    public void takePhoto() {
        System.out.println("Taking the photo");
    }

    public void savePhoto() {
        System.out.println("Saving the photo");
    }

    public abstract void editPhoto();
}