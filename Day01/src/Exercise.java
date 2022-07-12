public class Exercise {
    public static void main(String args[]){
        System.out.println("reverseWords");
        System.out.println(reverseWords("Hello, testing, one, two, three"));
        System.out.println();

        System.out.println("SumDigits");
        System.out.println(sumDigits("124avo45ca20do"));
        System.out.println();

        System.out.println("isPalindrome");
        System.out.println(isPalindrome("abba"));
        System.out.println(isPalindrome("hello"));
        System.out.println(isPalindrome("boaob"));
        System.out.println(isPalindrome("AAbSdDsBaa"));
        System.out.println();

        int[] arr = {4,5,10,2,25,36,7};
        System.out.println("secondBiggestNumber");
        System.out.println(secondBiggestNumber(arr));
        System.out.println();

        System.out.println("printCouplesAddingUpToSum");
        printCouplesAddingUpToSum(arr, 9);



    }

    public static String reverseStr(String str){
        char[] input = str.toCharArray();
        char[] res = new char [str.length()];
        for(int i = input.length - 1 ; i >=0; i--){
            //System.out.print(input[i]);
            res [str.length() - i] = input [i];
        }
        String result = res.toString();
        return result;
    }

    public static String reverseWords(String str){
        String[] words = str.split(" ");
        String res = "";

        for(int i = 0; i < words.length; i++)
        {
            res = res.concat(words[words.length - i - 1]);
            res = res.concat(" ");
        }

        return res;
    }

    public static boolean isDigit(char ch){
        return ch >='0' && ch <= '9';
    }

    public static int sumDigits(String str){
        int result = 0;
        char[] chars = str.toCharArray();
        for(int i = 0; i < str.length(); i++)
        {
            if(isDigit(chars[i])) {
                result+= Character.getNumericValue(chars[i]);
            }
        }

        return result;
    }

    public static boolean isPalindrome(String str){
        int leftIdx = 0;
        int rightIdx  = str.length() - 1;
        String allLowerCase = str.toLowerCase();

        while(leftIdx < rightIdx)
        {
            if(allLowerCase.charAt(leftIdx) != allLowerCase.charAt(rightIdx)){
                return false;
            }else {
                leftIdx++;
                rightIdx--;
            }
        }
        return true;
    }

    public static int secondBiggestNumber(int[] arr) {
        int max = arr[0];
        int secondMax = arr[1];
        if (secondMax > max) {
            int temp = secondMax;
            secondMax = max;
            max = temp;
        }

        for (int i = 2; i < arr.length; i++){
            if(arr[i] > max){
                secondMax = max;
                max = arr[i];
            }else if(arr[i] < max && arr[i] > secondMax) {
                secondMax = arr[i];
            }
        }

        return secondMax;
    }

    public static void printCouplesAddingUpToSum(int[] arr, int sum){
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i +1; j < arr.length; j++){
                if(arr[i] + arr[j] == sum){
                    System.out.println("[" + i + "," + j + "]");
                }
            }
        }
    }
}
