//1.	Create an abstract Shape class.
//2.	Create an abstract Employee class.

public abstract class Shape {
    protected final String wheel = "circle";
    protected final String Samosa = "triangle";
    protected final String bricks = "rectangle";
    protected final String floorTiles = "square";

    public abstract String getWheelShape();
    public abstract String getSamosaShape();
    public abstract String getBricksShape();
    public abstract String getFloorTilesShape();

}
