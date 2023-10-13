package Task4;

import java.util.ArrayList;
public class ShapeBuilder {

    ArrayList<Shape> Shapes;

    public ShapeBuilder() {
        this.Shapes = new ArrayList<>();
    }

    public void addShape(Shape s) {
        Shapes.add(s);

    }

    public void getTotalArea() {
        double totalArea=0.0;
        for(Shape s : Shapes) {
            totalArea += s.getArea();

        }
            System.out.println("Total area:" + totalArea);

        }
    }


