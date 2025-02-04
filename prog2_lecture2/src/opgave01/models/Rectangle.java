package opgave01.models;

public class Rectangle extends GeometricFigure{
    private double height;

    public Rectangle(double xCoordinate, double yCoordinate, double width, double height) {
        super(xCoordinate, yCoordinate, width);
        this.height = height;
    }

    @Override
    public double getArea(){
        return width * height;
    }

    @Override
    public void doubleUp(){
        width *= 2;
        height *= 2;
    }

    @Override
    public void halve() {
        width /= 2;
        height /= 2;
    }
}