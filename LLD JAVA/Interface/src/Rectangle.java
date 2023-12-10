public class Rectangle implements  Shape{
    double width,height;
      public  Rectangle(double width,double height){
          this.width=width;
          this.height=height;
      }
    @Override
    public double calcArea() {

        return   width*height;
    }

    @Override
    public double calcParameter() {
        return 2*(width*height);
    }
}
