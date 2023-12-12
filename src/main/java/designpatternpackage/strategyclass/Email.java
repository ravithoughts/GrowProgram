package designpatternpackage.strategyclass;

public class Email implements ShareFunctionality {
    @Override
    public void sharePhoto() {
        System.out.println("Share using Email");
    }
}