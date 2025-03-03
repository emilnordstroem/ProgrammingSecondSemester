package opgave04;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>(List.of(15, 0, -23, 42, 101, Integer.MIN_VALUE, 202, 0, -3));
        System.out.println(mergeSort(integers));
    }

    public static ArrayList<Integer> mergeSort(ArrayList<Integer> list) {
        if(list.size() <= 1){
            return list;
        }
        int middle = list.size() / 2;
        ArrayList<Integer> subListLeft = mergeSort(new ArrayList<>(list.subList(0, middle)));
        ArrayList<Integer> subListRight =  mergeSort(new ArrayList<>(list.subList(middle, list.size())));
        return merge(subListLeft, subListRight);
    }


    private static ArrayList<Integer> merge(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> mergedList = new ArrayList<>();

        int list1Index = 0;
        int list2Index = 0;

        while(list1Index < list1.size() && list2Index < list2.size()){
            if(list1.get(list1Index) <= list2.get(list2Index)){
                mergedList.add(list1.get(list1Index));
                list1Index++;
            } else {
                mergedList.add(list2.get(list2Index));
                list2Index++;
            }
        }

        while(list1Index < list1.size()){
            mergedList.add(list1.get(list1Index));
            list1Index++;
        }

        while(list2Index < list2.size()){
            mergedList.add(list2.get(list2Index));
            list2Index++;
        }

        return mergedList;
    }

}
