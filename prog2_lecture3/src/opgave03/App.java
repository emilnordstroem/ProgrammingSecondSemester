package opgave03;

public class App {
    public static void main(String[] args) {
        Measurable[] chillis = new Measurable[3];
        chillis[0] = new Chilli("Pepper", 100);
        chillis[1] = new Chilli("Bell-Pepper", 0);
        chillis[2] = new Chilli("Jalapeno", 7000);

        System.out.println(max(chillis));
        System.out.println(avg(chillis));

    }

    public static Measurable max(Measurable[] objects) {
        Measurable highestMeasured = objects[0];
        for(Measurable object : objects){
            if(object.getMeasure() > highestMeasured.getMeasure()){
                highestMeasured = object;
            }
        }
        return highestMeasured;
    }

    public static double avg(Measurable[] objects){
        int size = objects.length;
        double totalScovilleskale = 0;
        for(Measurable object : objects){
            totalScovilleskale += object.getMeasure();
        }
        return totalScovilleskale / size;
    }
}
