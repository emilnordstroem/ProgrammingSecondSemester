public class Opgave02 {

    public static void main(String[] args) {
        String text = "Radar";
        System.out.println(palindrome(text));;
    }

    private static boolean palindrome(String text){
        if(text.length() == 1){
            return true;
        }
        return isPalindrome(text.toLowerCase(), 0, text.length() - 1);
    }

    private static boolean isPalindrome(String text, int firstChar, int lastChar){
        if(text.charAt(firstChar) != text.charAt(lastChar)){
            return false;
        }
        if(firstChar < lastChar + 1){
            return isPalindrome(text, firstChar + 1, lastChar - 1);
        }
        return true;
    }

}
