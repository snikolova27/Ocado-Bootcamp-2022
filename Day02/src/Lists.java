import java.util.ArrayList;

public class Lists {

    public static void main(String[] args){
    ArrayList<String> myList = new ArrayList<String>();
    myList.add("NumberTwo");
    myList.add(0,"NumberOne");
    myList.add("NumberThree"); // removes the first element of that type
    System.out.println(myList);

    myList.remove("NumberOne");
    myList.remove(0);
    System.out.println(myList);

    ArrayList<Integer> nums = new ArrayList<Integer>();
    nums.add(4);
    nums.add(3);
    nums.add(2);
    nums.add(1);

    nums.remove(1); //removing the element at index 1
    nums.remove(Integer.valueOf(1)); // removing element with the value of 1
    System.out.println(nums);

    }
}
