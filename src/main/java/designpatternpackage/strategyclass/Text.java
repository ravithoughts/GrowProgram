package designpatternpackage.strategyclass;

public class Text implements ShareFunctionality {
    @Override
    public void sharePhoto() {
        System.out.println("Share using Text");
    }
}