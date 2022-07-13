import java.util.ArrayList;
import java.util.List;

public class reverseRotateList {
    public static void main(String[] args) {
        List <Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(4);
        numbers.add(3);
        reverseRotateList(numbers);
        System.out.println(numbers);
    }

    //first element goes to the end of the list
    public static <T> void reverseRotateList(List<T> list){
        T firstElement = list.remove(0);
        list.add(firstElement);
    }

}
