package designpatternpackage.builderclass;

public class KidsBicycle implements BicycleBuilder {
    private final Bicycle bicycle;

    public KidsBicycle() {
        bicycle = new Bicycle();
        bicycle.setBiCycleType("Kids Bicycle");
    }

    @Override
    public void SetHeight(int height) {
        bicycle.setBiCycleHeight(height);
    }

    @Override
    public void SetFrame() {
        System.out.println("Frame has been set.");
    }

    @Override
    public void SetGears() {
        System.out.println("Gears have been set.");
    }

    @Override
    public void PutTires() {
        System.out.println("Tires have been set.");
    }

    @Override
    public void SetColour(String colour) {
        bicycle.setBiCycleColor(colour);
        System.out.println("Bicycle is set with given colour: {0}" + colour);
    }

    @Override
    public void PutAccessaries() {
        System.out.println("Accessories have been set.");
    }

    @Override
    public Bicycle GetBicycle() {
        return this.bicycle;
    }
}