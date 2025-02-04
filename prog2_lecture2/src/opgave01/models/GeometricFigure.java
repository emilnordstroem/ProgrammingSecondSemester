package opgave01.models;

public abstract class GeometricFigure implements Resizable{
    protected double xCoordinate;
    protected double yCoordinate;
    protected double width;

    protected GeometricFigure(double xCoordinate, double yCoordinate, double length) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.width = length;
    }

    public abstract double getArea();

    @Override
    public String toString(){
        return String.format("X: %2f, Y: %2f",
                xCoordinate,
                yCoordinate);
    }
}