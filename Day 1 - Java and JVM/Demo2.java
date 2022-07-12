public class Demo2 {
    public static void main(String [] args) {
        System.out.println(getFootballCupsForYear(2022));
        String str1 = "Hi";
        String str2 = str1.concat(", my name is Sonya");
        System.out.println(str2);
        System.out.println(str1 + ", my name is Sonya");


        //string methods
        String str3 = "Doctor Dre";
        System.out.println(str3.substring(0,6)); // up to the character we are not taking
        System.out.println(str3.substring(7)); // begin index only

        System.out.println(prettifySentence("     hello, testing, 1, 2, 3     "));

        // for loops
        loops();

        // arrays
        int[] arr = {2,0,1,4,5};
        int[] arr2 = {1,2,3,4,5};
        int[] arr3 = {0,0,0};
        System.out.println(isArrayIncreasing(arr));
        System.out.println(isArrayIncreasing(arr2));
        System.out.println(isArrayIncreasing(arr3));

    }
    public static String getFootballCupsForYear(int year) {
        if((year % 4 == 0 && year != 2020) || year == 2021){
                return "Euro Cup";
        }else if(year % 4 == 2) {
            return "World Cup";
        }else{
            return "No Cup";
        }
    }

    public static String prettifySentence(String str){
        String res = str.trim(); // remove unnecessary leading and trailing spaces
        String firstLetter = res.substring(0,1);
        String leftover = res.substring(1);
        firstLetter = firstLetter.toUpperCase();
        leftover = leftover.toLowerCase();
        return firstLetter + leftover + ".";
    }

    public static void loops(){
        int[] arr = new int [5];
        for(int i  = 0; i < arr.length; i++){
            arr[i] = i + 10;
        }

        for(int number : arr){
            System.out.println(number);
        }
    }

    public static boolean isArrayIncreasing(int[] arr){
       for(int i = 0; i < arr.length - 1; i++){
           if(!(arr[i] <= arr[i + 1])) {
               return false;
           }
       }
       return true;
    }

    public static <T> T getElementAt(T[] arr, int index){
        
    }
}
