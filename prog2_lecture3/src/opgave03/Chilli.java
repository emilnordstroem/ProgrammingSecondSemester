package opgave03;

public class Chilli implements Measurable, Comparable<Chilli> {
    private String navn;
    private double scovilleskale;

    public Chilli(String navn, double scovilleskale) {
        this.navn = navn;
        this.scovilleskale = scovilleskale;
    }

    @Override
    public double getMeasure() {
        return scovilleskale;
    }

    @Override
    public String toString(){
        return String.format("Navn: %s%nScovilleskale: %.2f",
                navn, scovilleskale);
    }

    @Override
    public int compareTo(Chilli chilli) {
        return (int) (scovilleskale - chilli.getMeasure());
    }
}
