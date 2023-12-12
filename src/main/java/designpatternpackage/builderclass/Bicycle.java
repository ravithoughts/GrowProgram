package designpatternpackage.builderclass;

public class Bicycle {
    private String biCycleType;
    private int biCycleHeight;
    private String biCycleColor;

    public String getBiCycleType() {
        return biCycleType;
    }

    public String getBiCycleColor() {
        return biCycleColor;
    }

    public int getBiCycleHeight() {
        return biCycleHeight;
    }

    public String setBiCycleType(String biCycleType) {
        this.biCycleType = biCycleType;
        System.out.println("The type of biclyce is " + biCycleType);
        return biCycleType;
    }

    public int setBiCycleHeight(int biCycleHeight) {
        this.biCycleHeight = biCycleHeight;
        return biCycleHeight;
    }

    public String setBiCycleColor(String biCycleColor) {
        this.biCycleColor = biCycleColor;
        return biCycleColor;
    }

    public String toString() {
        return "Bicycle: " + this.biCycleType + ", " + this.biCycleColor + ", " + this.biCycleColor;
    }
}