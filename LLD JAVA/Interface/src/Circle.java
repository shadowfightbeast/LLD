public class Circle  implements  Shape{
    double radius;
    public  Circle(double radius){
        this.radius=radius;
    }
    @Override
    public double calcArea() {
        double PI=3.14;
        return   PI*radius*radius;
    }

    @Override
    public double calcParameter() {
        double PI=3.14;
        return   PI*2*radius;
    }
}
