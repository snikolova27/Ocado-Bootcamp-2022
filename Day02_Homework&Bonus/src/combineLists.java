import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class combineLists {
    public static void main(String[] args) {

        System.out.println(combineLists(List.of("1", "2", "3", "4", "5"), List.of("x", "y", "z")));

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

        System.out.println("Combined lists: " + combineLists(nums1, nums3));

        List<Character> chars1 = new ArrayList<>();
        chars1.add('a');
        chars1.add('b');
        chars1.add('c');
        System.out.println("First list: " + chars1);

        List<Character> chars2 = new ArrayList<>();
        chars2.add('e');
        chars2.add('f');
        chars2.add('s');
        System.out.println("Second list: " + chars2);

        System.out.println("Combined lists: " + combineLists(chars1, chars2));


    }
    public static <T> List<T> combineLists(List<T> list1, List<T> list2){
        List<T> result = new ArrayList<>();
        List<T> list1Copy = new ArrayList<>(list1);
        List<T> list2Copy = new ArrayList<>(list2);


        while(!list1Copy.isEmpty() || !list2Copy.isEmpty()){
            if(!list1Copy.isEmpty() && !list2Copy.isEmpty()){
                T fromFirst = list1Copy.remove(0);
                T fromSecond = list2Copy.remove(0);
                result.add(fromFirst);
                result.add(fromSecond);
            }else if(list1Copy.isEmpty() && !list2Copy.isEmpty()){
                T toPush = list2Copy.remove(0);
                result.add(toPush);
            }else if(!list1Copy.isEmpty() && list2Copy.isEmpty()){
                T toPush = list1Copy.remove(0);
                result.add(toPush);
            }
        }

        return result;
    }

}
