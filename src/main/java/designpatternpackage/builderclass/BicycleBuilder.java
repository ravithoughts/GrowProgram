package designpatternpackage.builderclass;

public interface BicycleBuilder {
    void SetHeight(int height);

    void SetFrame();

    void SetGears();

    void PutTires();

    void SetColour(String colour);

    void PutAccessaries();

    Bicycle GetBicycle();
}