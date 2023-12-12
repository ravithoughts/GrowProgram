package designpatternpackage.builderclass;

public class BicycleBuildDirector {
    public Bicycle Construct(BicycleBuilder builder, String colour, int height) {
        builder.SetFrame();
        builder.SetGears();
        builder.SetColour(colour);
        builder.SetHeight(height);
        builder.PutTires();
        builder.PutAccessaries();
        Bicycle bicycle = builder.GetBicycle();
        return bicycle;
    }
}