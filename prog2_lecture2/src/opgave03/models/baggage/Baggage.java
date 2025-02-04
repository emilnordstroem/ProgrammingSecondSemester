package opgave03.models.baggage;

import java.util.HashMap;

public class Baggage {
    private final HashMap<Baggagetype, Double> baggage = new HashMap<>();

    public Baggage(Baggagetype baggagetype, Double vægt) {
        this.baggage.put(baggagetype, vægt);
    }

    public HashMap<Baggagetype, Double> getBaggage() {
        return baggage;
    }

    public double beregnPris () {
        double vægt = baggage.values().iterator().next();
        if (vægt > 28) {
            return 590;
        } else if (vægt > 23.1) {
            return 330;
        } else {
            return 310;
        }
    }

    public Baggagetype getType(){
        if(!baggage.isEmpty()){
            return baggage.keySet().iterator().next();
        }
        return null;
    }

    public double getVægt(){
        try{
            if(!baggage.isEmpty()){
                return baggage.values().iterator().next();
            }
        } catch (NullPointerException e) {
            System.out.println("NullPointerException in getVægt()");;
        }
        return 0.0;
    }
}