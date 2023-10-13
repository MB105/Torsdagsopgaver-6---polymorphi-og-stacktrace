package Task4;

class Square implements Shape {

    double length;
    double width;

    Square(double length,double width){
        this.length=length;
        this.width=width;

    }
    @Override
    public double getArea() {
        double area=length*width;
        return area;



    }
}

