package opgave04;

public class Main {
    public static void main(String[] args) {
        int[] intArray = new int[]{ -17, -3, 0, 5, 27, 42, 1001, Integer.MAX_VALUE};
        boolean found = contains(intArray, 42);
        System.out.println(found);
    }

    private static boolean contains(int[] candidates, int candidate) {
        return binarySearch(candidate, candidates, 0, candidates.length - 1);
    }

    private static boolean binarySearch(int candidate, int[] candidates, int left, int right){
        if(left >= right){
            return false;
        }
        int middle = left - (left - right) / 2;
        if(candidates[middle] == candidate){
            return true;
        } else if (candidates[middle] > candidate) {
            return binarySearch(candidate, candidates, left, middle - 1);
        } else {
            return binarySearch(candidate, candidates, middle + 1, right);
        }
    }
}
