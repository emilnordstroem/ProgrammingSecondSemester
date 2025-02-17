package Opgave04;

public class Opgave04Main {
    public static String reverse(String s) {
        if(s.isEmpty() || s.length() == 1){
            return s;
        }
        return s.charAt(s.length() - 1) + reverse(s.substring(0, s.length() - 1));
    }
}
