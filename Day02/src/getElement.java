public class getElement {

    public static void main(String[] args){
    Integer[] ints = new Integer[] {1,2,5,4,5,6,52};
    Character[] chars = new Character[] {'c','a','b','d'};

    System.out.println(getElementAt(ints, 3));
    System.out.println(getElementAt(chars, 3));
    }

    public static <T> T getElementAt(T[] arr, int index){

        if(index > arr.length || index < 0){
            return null;
        }
        return arr[index];
    }

}
