import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class mergeSortedList {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(3);
        list1.add(5);

        List<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(7);
        list2.add(9);

        List<Integer> list3 = new ArrayList<>();
        list3.add(88);
        list3.add(2);


        System.out.println(mergeSortedLists(list1, list2)); // should return [1, 2, 3, 5, 7, 9]
       // System.out.println(mergeSortedLists(list1, list3));   // throws an exception
    }

    private static boolean isListSorted(List<Integer> list){
        List<Integer> copyList = new ArrayList<>(list);
        Integer lastChecked = copyList.remove(0);
        while(!copyList.isEmpty()){
            Integer current = copyList.remove(0);
            if(lastChecked > current){
                return false;
            }else{
                lastChecked = current;
            }
        }

        return true;
    }
    public static List<Integer> mergeSortedLists(List<Integer> first, List<Integer> second){
        if(!isListSorted(first)){
            throw new IllegalArgumentException("The first list is not sorted.");
        }else if(!isListSorted(second)){
            throw new IllegalArgumentException("The second list is not sorted.");
        }
        List<Integer> result = new ArrayList<>();
        result.addAll(first);
        result.addAll(second);
        Collections.sort(result);
        return result;
    }

}
