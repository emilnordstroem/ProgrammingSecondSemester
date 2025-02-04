package opgave03.models.billet;

import opgave03.models.baggage.Baggage;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class SASBillet {
    protected ArrayList<Baggage> medbragtBagage;

    protected static double prisPrEkstraHåndbagage = 120;
    protected static double prisPrEkstraCheckINBagage = 350;

    protected int tilladtAntalHåndbagage;
    protected HashMap<Integer, Double> tilladtIndchecketBagage; // Antal og Vægt


    protected SASBillet(ArrayList<Baggage> medbragtBagage,
                        int tilladtAntalHåndbagage, HashMap<Integer, Double> tilladtIndchecketBagage) {
        this.medbragtBagage = medbragtBagage;
        this.tilladtAntalHåndbagage = tilladtAntalHåndbagage;
        this.tilladtIndchecketBagage = tilladtIndchecketBagage;
    }

    public abstract double beregnBagagePris();
}