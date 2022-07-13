import java.util.ArrayList;
import java.util.List;

public class appendReversedList {
    public static void main(String[] args) {
        List<Integer> nums1 = new ArrayList<>();
        nums1.add(1);
        nums1.add(2);
        System.out.println("First list: " + nums1);

        List<Integer> nums3 = new ArrayList<>();
        nums3.add(5);
        nums3.add(4);
        nums3.add(2);
        nums3.add(10);
        nums3.add(24);
        System.out.println("Second list: " + nums3);

        System.out.println("Append reversed: " + appendReversedList(nums1, nums3));
    }
    public static <T> List<T> appendReversedList(List<T> list1, List<T> list2){
    List<T> result = new ArrayList<>();

    while(!list1.isEmpty()){
        T toPush = list1.remove(0);
        result.add(toPush);
    }
    while(!list2.isEmpty()){
        T toPush = list2.remove(list2.size() - 1);
        result.add(toPush);
    }

    return result;
    }

}
