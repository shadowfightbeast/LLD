public class ShapeFactory {
    public static Shape getShape(String shapeType){
        if(shapeType==null) return null;
        else if(shapeType =="circle"){
            return new Circle();
        }
        else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectanlge();
        }else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
