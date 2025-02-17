package Opgave05;

public class Opgave05Main {
    public static int sfd(int a, int b) {
        if(b <= 0){
            return a;
        }
        return sfd(b, (a % b));
    }
}
