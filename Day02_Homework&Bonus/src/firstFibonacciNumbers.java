import java.util.ArrayList;
import java.util.List;

public class firstFibonacciNumbers {
    public static void main(String[] args) {
        System.out.println(firstFibonacciNumbers(5)); // [0, 1, 1, 2, 3]
        System.out.println(firstFibonacciNumbers(20)); //[0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181]
        //System.out.println(firstFibonacciNumbers(1));
        System.out.println(firstFibonacciNumbers(9));  //[0, 1, 1, 2, 3, 5, 8, 13, 21]
    }

    public static final Integer firstFib = 0;
    public static final Integer secondFib = 1;

    private static Integer getNextFib(Integer prev1, Integer prev2){
        return prev1 + prev2;
    }
    public static List<Integer> firstFibonacciNumbers(int n){
        List<Integer> result = new ArrayList<>();

        if(n <= 1){
            throw new IllegalArgumentException("n should be > 1");
        }
        if(n >= 2){
            result.add(firstFib);
            result.add(secondFib);
            if(n > 2)
            {
                for(int i = 2; i < n; i++){
                    Integer toAdd = getNextFib(result.get(i - 2), result.get(i-1));
                    result.add(toAdd);
                }
            }
        }

        return result;
    }

}
