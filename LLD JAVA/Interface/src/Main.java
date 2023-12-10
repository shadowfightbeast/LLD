public class Main {
    public static void main(String[] args) {

      Shape circle1=new Circle(10);
      Shape triangle=new Triangle(1,2,3);
      Shape rectangle=new Rectangle(10,15);
        System.out.println(circle1.calcArea());
        System.out.println(triangle.calcParameter());
        System.out.println(rectangle.calcArea());
    }
}