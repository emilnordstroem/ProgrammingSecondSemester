package opgave01.models;

public class Square extends GeometricFigure {
    public Square(double xCoordinate, double yCoordinate, double width) {
        super(xCoordinate, yCoordinate, width);
    }

    @Override
    public double getArea(){
        return width * 2;
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