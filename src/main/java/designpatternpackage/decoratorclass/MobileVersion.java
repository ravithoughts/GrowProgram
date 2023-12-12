package designpatternpackage.decoratorclass;

public class MobileVersion implements WebPage {
    public int rank =5;

    @Override
    public int rank() {
        System.out.println("The Mobile Version Rank is " + rank);
        return rank;
    }
}