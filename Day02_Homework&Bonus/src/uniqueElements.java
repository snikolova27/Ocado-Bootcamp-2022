import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class uniqueElements {
    public static void main(String[] args) {
        System.out.println(uniqueElements(List.of(1, 4, 7, 11, 7, 8, 4, 11, 1, 1)));
        // should return [1, 4, 7, 8, 11] (in any order)
        System.out.println(unique2(List.of(1, 4, 7, 11, 7, 8, 4, 11, 1, 1))); // using a stream

    }
    public static List<Integer> uniqueElements(List<Integer> numbers){
        if(numbers.isEmpty()){
            return numbers;
        }
        List<Integer> result = new ArrayList<>();
        result.add(numbers.get(0));
        int size = numbers.size();

        for(int i = 1; i < size; i++){
            Integer toAdd = numbers.get(i);
            if(!result.contains(toAdd)){
                result.add(toAdd);
            }
        }

        return result;
    }

    //version using a stream
    public static List<Integer> unique2(List<Integer> numbers){
        return numbers.stream()
                .distinct()
                .collect(Collectors.toList());
    }

}
