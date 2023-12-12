package designpatternpackage.decoratorclass;

public class DesktopVersion implements WebPage {
    public int rank = 10;

    @Override
    public int rank() {
        System.out.println("The Desktop Version Rank is " + rank);
        return rank;
    }
}