package opgave03.models.billet;

import opgave03.models.baggage.Baggage;
import opgave03.models.baggage.Baggagetype;

import java.util.ArrayList;
import java.util.HashMap;

public class GoSmart extends SASBillet {
    public GoSmart(ArrayList<Baggage> medbragtBagage) {
        super(medbragtBagage,1, opretHashmap()); // Explicit
    }

    private static HashMap<Integer, Double> opretHashmap(){
        HashMap<Integer, Double> nytHashMap = new HashMap<>();
        nytHashMap.put(1, 23.0);
        return nytHashMap;
    }


    @Override
    public double beregnBagagePris() {
        double resultat = 0;

        int antalHåndbagage = 0;
        int antalCheckInBagage = 0;
        double totalVægtPåCheckIn = 0;

        for(Baggage baggage : medbragtBagage){
            if(baggage.getType().equals(Baggagetype.HÅNDBAGAGE)){
                if(antalHåndbagage <= tilladtAntalHåndbagage){
                    antalHåndbagage++;
                } else {
                    resultat += prisPrEkstraHåndbagage;
                }
            } else if (baggage.getType().equals(Baggagetype.INCHECKETBAGAGE)) {
                if(!tilladtIndchecketBagage.containsKey(antalCheckInBagage)
                        || totalVægtPåCheckIn > tilladtIndchecketBagage.get(antalCheckInBagage)) {
                    resultat += prisPrEkstraCheckINBagage;
                }
            }
        }
        return resultat;
    }
}