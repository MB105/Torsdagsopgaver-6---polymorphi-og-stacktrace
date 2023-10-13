package Task4;

class Circle implements Shape {
double radius;
    Circle(double radius) {
        this.radius=radius;


    }

    @Override
    public double getArea() {
        double area=3.14*(radius*radius);
        return area;

    }
}
