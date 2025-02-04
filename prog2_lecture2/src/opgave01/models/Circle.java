package opgave01.models;

public class Circle extends GeometricFigure {
    public Circle(double xCoordinate, double yCoordinate, double width) {
        super(xCoordinate, yCoordinate, width);
    }

    @Override
    public double getArea(){
        return 3.14 * (width/2);
    }

    @Override
    public void doubleUp(){
        width *= 2;
    }

    @Override
    public void halve() {
        width /= 2;
    }
}