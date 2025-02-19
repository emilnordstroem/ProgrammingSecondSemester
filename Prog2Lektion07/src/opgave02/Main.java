package opgave02;

public class Main {
    public static void main(String[] args) {
        String palindrom = "ibofobi";
        String notPalindrom = "roller";

        System.out.println("Er " + palindrom + " et palindrom? " + isPalindrom(palindrom));
        System.out.println("Er " + notPalindrom + " et palindrom? " + isPalindrom(notPalindrom));
    }

    private static boolean isPalindrom(String palindrom) {
        return palindrom(palindrom, 0, palindrom.length() - 1);
    }

    private static boolean palindrom(String text, int firstCharIndex, int lastCharIndex){
        if(text.charAt(firstCharIndex) != text.charAt(lastCharIndex)){
            return false;
        }
        if(firstCharIndex < lastCharIndex + 1){
            return palindrom(text, firstCharIndex + 1, lastCharIndex - 1);
        }
        return true;
    }
}
