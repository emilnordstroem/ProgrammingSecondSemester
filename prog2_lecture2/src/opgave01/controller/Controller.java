package opgave1.controller;

import opgave01.models.Circle;
import opgave01.models.GeometricFigure;
import opgave01.models.Square;
import opgave01.storage.Storage;

public class Controller {
    public static void main(String[] args) {
        GeometricFigure circle = new Circle(1, 10, 20);
        System.out.println(circle.getArea());
        Storage.addGeometricFigure(circle);

        GeometricFigure square = new Square(2,-20, 20);
        System.out.println(square.getArea());
        Storage.addGeometricFigure(square);

        for(GeometricFigure figure : Storage.getGeometricFigures()){
            System.out.println(figure.toString());
        }
    }
}
