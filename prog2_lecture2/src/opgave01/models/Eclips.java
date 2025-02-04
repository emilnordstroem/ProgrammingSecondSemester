package opgave01.models;

public class Eclips extends GeometricFigure {
    private double height;

    public Eclips(double xCoordinate, double yCoordinate, double width, double height) {
        super(xCoordinate, yCoordinate, width);
        this.height = height;
    }

    @Override
    public double getArea() {
        return 3.14 * (width / 2) * (height / 2);
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