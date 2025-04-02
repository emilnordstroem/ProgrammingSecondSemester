package opgave02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class Opgave02 {

    public static void main(String[] args) {
        boolean check = checkParantes("((){})");
        System.out.println(check);
    }

    public static boolean checkParantes(String s) {
        char[] charactersOfString = s.replaceAll("[^(){}\\[\\]]", "").toCharArray();
        System.out.println(charactersOfString);
        Stack<Character> stackOfBrackets = new Stack<>();
        Stack<Character> stackOfSquareBrackets = new Stack<>();
        Stack<Character> stackOfCurlyBrackets = new Stack<>();

        for(int index = 0; index < charactersOfString.length; index++){
            switch (charactersOfString[index]){
                case '(':
                    stackOfBrackets.push(charactersOfString[index]);
                    break;
                case ')':
                    if (stackOfBrackets.isEmpty()) {
                        return false;
                    } else if (stackOfBrackets.peek() == '(') {
                        stackOfBrackets.pop();
                    } else {
                        return false;
                    }
                    break;
                case '[':
                    stackOfSquareBrackets.push(charactersOfString[index]);
                    break;
                case ']':
                    if (stackOfSquareBrackets.isEmpty()) {
                        return false;
                    } else if (stackOfSquareBrackets.peek() == '[') {
                        stackOfSquareBrackets.pop();
                    } else {
                        return false;
                    }
                    break;
                case '{':
                    stackOfCurlyBrackets.push(charactersOfString[index]);
                    break;
                case '}':
                    if (stackOfCurlyBrackets.isEmpty()) {
                        return false;
                    } else if (stackOfCurlyBrackets.peek() == '{') {
                        stackOfCurlyBrackets.pop();
                    } else {
                        return false;
                    }
                    break;
                default:
                    continue;
            }
        }

        return true;
    }

}
