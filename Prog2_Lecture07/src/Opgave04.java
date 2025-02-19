import java.util.ArrayList;
import java.util.List;

public class Opgave04 {

    public static void main(String[] args) {
        List<Integer> sortedIntegerList = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15));
        int target = 15;
        System.out.println(search(sortedIntegerList, target));
    }

    private static boolean search(List<Integer> sortedList, int target){
        return binarySearch(sortedList, target, 0, sortedList.size() - 1);
    }

    private static boolean binarySearch(List<Integer> list, int target, int left, int right){
        if(left > right){
            return false;
        }
        int middel = left + (right - left) / 2;
        if (list.get(middel) == target){
            return true;
        } else if (list.get(middel) > target){
            return binarySearch(list, target, left, middel - 1);
        } else {
            return binarySearch(list, target, middel + 1, right);
        }
    }


}
