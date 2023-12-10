public  abstract  class AbstractShapeFactory {
    protected   abstract  Shape factoryMethod();
    public Shape getShape(){
        return  factoryMethod();
    }
}

class RectangleFactory extends AbstractShapeFactory
{
    protected    Shape factoryMethod(){
        return  new Rectanlge();
    }
}class CirlceFactory extends AbstractShapeFactory
{
    protected  Shape factoryMethod(){
        return  new Circle();
    }
}class SquareFactory extends AbstractShapeFactory
{
    protected  Shape factoryMethod(){
        return  new Square();
    }
}