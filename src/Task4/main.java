package Task4;

public class main {

    public static void main(String[]args){

        ShapeBuilder shapeBuilder=new ShapeBuilder();

        Circle circle=new Circle(5.0);
        double result1=circle.getArea();
        System.out.println("Area of circle:" + result1);

        Square square=new Square(5.0,7.0);
        double result2=square.getArea();
        System.out.println("Area of square:" + result2);

        shapeBuilder.addShape(circle);
        shapeBuilder.addShape(square);

        shapeBuilder.getTotalArea();

    }
}
