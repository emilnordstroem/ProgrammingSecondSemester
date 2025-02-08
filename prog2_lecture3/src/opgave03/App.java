package opgave03;

public class App {
    public static void main(String[] args) {
        Chilli[] chillis = new Chilli[3];
        chillis[0] = new Chilli("Pepper", 100);
        chillis[1] = new Chilli("Bell-Pepper", 0);
        chillis[2] = new Chilli("Jalapeno", 7000);

        System.out.println(max(chillis));
        System.out.println(avg(chillis));

    }

    /*
    Comparable interface enables through Chilli class
     */
    public static Chilli max(Chilli[] chillis) {
        Chilli highestMeasured = chillis[0];
        for(Chilli chilli : chillis){
            if(chilli.compareTo(highestMeasured) > 0){
                highestMeasured = chilli;
            }
        }
        return highestMeasured;
    }

    /*
    When Chilli class isn't important, Measurable interface class can be used.
    Compiler accepts the arguments passed (Chilli) to Measurable parameter declaration.
    This method is usable for all instances that extends Measurable.
     */
    public static double avg(Measurable[] objects){
        int size = objects.length;
        double total = 0;
        for(Measurable object : objects){
            total += object.getMeasure();
        }
        return total / size;
    }
}
