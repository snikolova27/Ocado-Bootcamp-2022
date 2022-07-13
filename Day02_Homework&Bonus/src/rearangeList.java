import java.util.ArrayList;
import java.util.List;

public class rearangeList {
    public static void main(String[] args) {
        List<Integer> nums1 = new ArrayList<>();
        nums1.add(1);
        nums1.add(2);
        System.out.println("Original list :" + nums1);
        rearrangeList(nums1);
        System.out.println("Rearranged list: "+ nums1);

        List<Integer> nums2 = new ArrayList<>();
        nums2.add(1);
        nums2.add(2);
        nums2.add(3);
        System.out.println("Original list: " + nums2);
        rearrangeList(nums2);
        System.out.println("Rearranged list: " + nums2);
        System.out.println(nums2);

        List<Integer> nums3 = new ArrayList<>();
        nums3.add(5);
        nums3.add(4);
        nums3.add(2);
        nums3.add(10);
        nums3.add(24);
        System.out.println("Original list: " + nums3);
        rearrangeList(nums3);
        System.out.println("Rearranged list: " + nums3);
    }

    public static void rearrangeList(List<Integer> list){
        int size = list.size();
        if(size == 2){
            Integer first = list.remove(0);
            list.add(first);
        }
        else if(size == 3){
            Integer second = list.remove(1);
            list.add(second);

        }else {
            Integer secondToLast = list.remove(size - 2);
            Integer second = list.remove(1);
            list.add(second);
            list.add(secondToLast);
        }

    }

}
