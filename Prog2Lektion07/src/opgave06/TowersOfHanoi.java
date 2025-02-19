package opgave06;

public class TowersOfHanoi {
    public static void moveDisk(int numberOfDisks, int fromPeg, int toPeg) {
        if (numberOfDisks == 1) {
            System.out.println("Flyt disken fra pæl nummer " + fromPeg + " til pæl nummer " + toPeg);
        } else {
            int newPeg = 6 - fromPeg - toPeg;
            moveDisk(numberOfDisks - 1, fromPeg, newPeg);
            System.out.println("Flyt disken fra pæl nummer " + fromPeg + " til pæl nummer " + toPeg);
            moveDisk(numberOfDisks - 1, newPeg, toPeg);
        }
    }
}
