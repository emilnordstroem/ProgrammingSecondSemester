package opgave01.storage;

import opgave01.models.GeometricFigure;

import java.util.ArrayList;

public class Storage {
    private static final ArrayList<GeometricFigure> geometricFigures = new ArrayList<>();

    public static void addGeometricFigure(GeometricFigure figure){
        if(!geometricFigures.contains(figure)){
            geometricFigures.add(figure);
        }
    }

    public static ArrayList<GeometricFigure> getGeometricFigures(){
        return new ArrayList<>(geometricFigures);
    }
}