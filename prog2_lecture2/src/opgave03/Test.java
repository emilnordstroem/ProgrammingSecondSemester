package opgave03;

import opgave03.models.baggage.Baggage;
import opgave03.models.baggage.Baggagetype;
import opgave03.models.billet.Business;
import opgave03.models.billet.GoLight;
import opgave03.models.billet.SASBillet;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Baggage håndtaske = new Baggage(Baggagetype.HÅNDBAGAGE, 23.0);
        Baggage checkIn = new Baggage(Baggagetype.INCHECKETBAGAGE, 35.0);

        ArrayList<Baggage> baggageArrayList = new ArrayList<>();
        baggageArrayList.add(håndtaske);
        baggageArrayList.add(checkIn);

        SASBillet goLight = new GoLight(baggageArrayList);
        System.out.println(goLight.beregnBagagePris());

        SASBillet business = new Business(baggageArrayList);
        System.out.println(business.beregnBagagePris());
    }
}