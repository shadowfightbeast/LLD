public abstract class AbstractFactory {

    abstract Color getColor(String color);

    abstract Shape getShape(String shape);

    public Hollywood getHName(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getHName'");
    }

    public Bollywood getBName(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getBName'");
    }
}

class shapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType) {
        if (shapeType == null)
            return null;
        else if (shapeType == "circle")
            return new Circle();
        else if (shapeType == "square")
            return new Square();
        else if (shapeType == "rectangle")
            return new Rectangle();
        return null;
    }

    @Override
    Color getColor(String color) {
        return null;
    }
}

class colorFactory extends AbstractFactory {
    @Override
    Shape getShape(String shape) {
        return null;
    }

    @Override
    public Color getColor(String color) {
        if (color == null)
            return null;
        else if (color == "red")
            return new Red();
        else if (color == "green")
            return new Green();
        else if (color == "blue")
            return new Blue();
        return null;

    }
}
