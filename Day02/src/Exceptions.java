public class Exceptions {

    public static void main(String[] args){
    checkedException();
    }
    public static void checkedException(){
       try{
            Thread.sleep(300);  // throws interrupted exception
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
