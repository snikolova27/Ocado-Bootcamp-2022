import java.util.ArrayList;
import java.util.List;

public class rotateList {

    public static void main(String[] args){
        List<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(3);
        nums.add(5);

        rotateList(nums);
        System.out.println(nums);
    }

    public static <T> void rotateList(List<T> list) {
        T lastElement = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        //T last element = list.remove(list.size() - 1);   returns removed element
        list.add(0, lastElement);
    }
}
