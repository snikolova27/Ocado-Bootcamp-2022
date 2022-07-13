import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class listOfDigits {
    public static void main(String[] args) {
        System.out.println(listOfDigits(25));
        System.out.println(listOfDigits(165446));
        System.out.println(listOfDigits(0));
    }
    public static List<Integer> listOfDigits(int number){
        List<Integer> digits = new ArrayList<>();
        if(number >= 0 && number <= 9){
            digits.add(Integer.valueOf(number));
            return digits;
        }
        while(number > 0)
        {
            int digit = number % 10;
            number = number / 10;
            digits.add(Integer.valueOf(digit));
        }

        Collections.reverse(digits);
        return digits;
    }

}
