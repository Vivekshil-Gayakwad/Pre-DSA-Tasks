public class shapeTest extends Shape{

    @Override
    public String getWheelShape() {
        return super.wheel;
    }

    @Override
    public String getBricksShape() {
        return super.bricks;
    }

    @Override
    public String getFloorTilesShape() {
        return super.floorTiles;
    }

    @Override
    public String getSamosaShape() {
        return super.Samosa;
    }

    public static void main(String[] args) {
        shapeTest s1 = new shapeTest();
        String SamosaShape = s1.getSamosaShape();
        System.out.println(SamosaShape);

    }
}
