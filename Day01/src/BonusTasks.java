import java.util.Arrays;
public class BonusTasks {

    public static void main(String[] args){
        int[] arr = {4,1,2,5,7,6,7}; // sorted 1 2 4 5 6 7 7
        int[] arr2 = {2,4,5,7};
        System.out.println(countPossibleTriangles(arr));
        System.out.println(countPossibleTriangles(arr2));

        System.out.println(numberOfPalindromesWithLength("Did your dad like Tenet?", 3));
        //should return 2 - The palindromes are "Did" and "dad"
        System.out.println(numberOfPalindromesWithLength("Did your dad like Tenet?", 4));
        //should return 0 - No palindromes
        System.out.println(numberOfPalindromesWithLength("Did your dad like Tenet?", 5));
        //should return 2 - The palindromes are " dad " and "Tenet"

    }

    public static int countPossibleTriangles(int[] sides){
        int count = 0;
        Arrays.sort(sides);

        for(int i = 0; i < sides.length - 2; i++){
            for(int k = i + 1 ; k < sides.length - 1; k++){
                int currentSum = sides[i] + sides[k];
                for(int j = k+1; j < sides.length; j++){
                    if(currentSum > sides[j]){
                        count++;
                    }
                }
            }
        }

        return count;
    }

    public static boolean isPalindrome(String str){
        int len = str.length();
        int middle = len / 2;

        //int leftIdx = 0;
        //  int rightIdx  = str.length() - 1;
        String allLowerCase = str.toLowerCase();

        for(int i = 0; i < middle; i++) {
            if (allLowerCase.charAt(i) != allLowerCase.charAt(len - 1 - i)) {
                return false;
            }
        }

        return true;
    }

    public static int numberOfPalindromesWithLength(String str, int numberOfCharacters){
        int cnt = 0;
        for(int i  = 0; i < str.length() - numberOfCharacters + 1; i++){
            if(isPalindrome(str.substring(i, i  + numberOfCharacters))){
                cnt++;
            }
        }
        return cnt;
    }

}
