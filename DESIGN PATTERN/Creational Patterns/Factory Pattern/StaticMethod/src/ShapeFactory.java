package LLD_JAVA.Factory.StaticMethod.src;

public class ShapeFactory {
    public static Shape getShape(String shapeType) {
        if (shapeType == null)
            return null;
        else if (shapeType == "CIRCLE") {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}
