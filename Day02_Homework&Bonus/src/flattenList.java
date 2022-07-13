import java.util.ArrayList;
import java.util.List;

public class flattenList {
    public static void main(String[] args) {
        System.out.println(flattenList(List.of(List.of(1, 4, 7), List.of(11, 7, 8))));
        // should return [1, 4, 7, 11, 7, 8]

    }
    public static List<Integer> flattenList(List<List<Integer>> listOfLists){
        List<Integer> result = new ArrayList<>();
        for(List<Integer> element : listOfLists){
            result.addAll(element);
        }
        return result;
    }

}
