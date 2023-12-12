package designpatternpackage.strategyclass;

public class SocialMedia implements ShareFunctionality {
    @Override
    public void sharePhoto() {
        System.out.println("Share using Social Media");
    }
}