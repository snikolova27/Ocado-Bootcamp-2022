public class tryParseInteger {
    public static void main(String[] args) {
        String str = "12";
        System.out.println(tryParseInteger(str));
        tryParseInteger("3s");

    }

    public static int tryParseInteger(String number){
        try{
            int num = Integer.parseInt(number);
            return num;
        }catch(NumberFormatException e){
            System.out.println("Unable to parse string " + number + " to integer");
            return 0;
        }

    }

}
