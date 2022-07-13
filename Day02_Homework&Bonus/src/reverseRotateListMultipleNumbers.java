import java.util.ArrayList;
import java.util.List;

public class reverseRotateListMultipleNumbers {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        reverseRotateList(list1, 2); // should change it to [3, 4, 5, 1, 2]
        System.out.println(list1);
       // reverseRotateList(list1, 6);

    }
    public static <T> void reverseRotateList(List<T> list, int n){
        if(n > list.size()){
            throw new RuntimeException("Number of elements to rotate is bigger than the length of the list");
        }
        List<T> result = new ArrayList<>();
        List<T> helper = new ArrayList<>(); // will keep the first n elements of the list
        for(int i = 0; i < n; i++){
            T toMove = list.remove(0);
            helper.add(toMove);
        }
        //System.out.println(helper);
        for(int i = 0; i < list.size(); i++){
            result.add(list.get(i));
        }
        result.addAll(helper);
        list.clear();
        list.addAll(result);

    }

}
