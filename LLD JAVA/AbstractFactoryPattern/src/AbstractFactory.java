public abstract   class AbstractFactory {

    abstract  Color getColor(String color);
    abstract  Shape getShape(String shape);
}
class shapeFactory extends  AbstractFactory{
    @Override
    public  Shape getShape(String shapeType) {
        if(shapeType==null) return  null;
        else if(shapeType=="circle") return  new Circle();
        else if(shapeType=="square") return  new Square();
        else if(shapeType=="rectangle") return  new Rectanlge();
        return null;
    }

    @Override
    Color getColor(String color) {
        return null;
    }
}
class colorFactory extends  AbstractFactory{
    @Override
    Shape getShape(String shape) {
        return null;
    }

    @Override
   public Color getColor(String color) {
        if(color==null) return  null;
        else  if(color=="red") return  new Red();
        else  if(color=="green") return  new Green();
        else  if(color=="blue") return  new Blue();
        return null;

    }
}
