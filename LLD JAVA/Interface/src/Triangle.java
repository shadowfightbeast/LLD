public class Triangle implements  Shape{
    double a,b,c;
    public Triangle(double a,double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    @Override
    public double calcArea() {
        return 0.5*b*c;
    }

    @Override
    public double calcParameter() {
        return  a+b+c;
    }
}
