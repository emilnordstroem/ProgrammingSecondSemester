package opgave03.models.billet;

import opgave03.models.baggage.Baggage;

import java.util.ArrayList;
import java.util.HashMap;

public class GoLight extends SASBillet {

    public GoLight(ArrayList<Baggage> medbragtBagage) {
        super(medbragtBagage,1, new HashMap<>());
    }

    @Override
    public double beregnBagagePris(){
        double resultat = 0;
        if(!medbragtBagage.isEmpty()){
            for(Baggage baggage : medbragtBagage){
                resultat += baggage.beregnPris();
            }
        }
        return resultat;
    }
}