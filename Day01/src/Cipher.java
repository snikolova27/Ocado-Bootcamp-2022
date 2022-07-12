public class Cipher {
    public static void main(String[] args){
        System.out.println(ceasarCipher("There's a starman waiting in the sky.", 3));
        System.out.println(reverseCeasarCipher("Wkhuh'v d vwdupdq zdlwlqj lq wkh vnb.", 3));

    }

    public static boolean isLetter(char ch){
        return (ch >= 'a' && ch <='z') || (ch >='A' && ch <= 'Z');
    }

    // rotation = k
    // multiplier - used to know if we are encrypting or decrypting
    public static char changeCharacter(char ch, int rotation, int multiplier){
        final int cntLetters = 26;
        if(!isLetter(ch)){
            return ch;
        }

        rotation = rotation % cntLetters;  // if it this more than 26, we start again from the beginning

        ch += (rotation * multiplier);

        if(!isLetter(ch)){
            ch -= (cntLetters * multiplier);
        }

        return ch;
    }

    public static char encrypt(char ch, int rotation){
        return changeCharacter(ch, rotation, 1);
    }

    public static char decrypt(char ch, int rotation){
        return changeCharacter(ch, rotation, -1);
    }

    public static String ceasarCipher(String s, int k){
        String res = "";
        int len = s.length();
        for(int i = 0; i < len; i++){
            res+= encrypt(s.charAt(i), k);
        }

        return res;
    }

    public static String reverseCeasarCipher(String s, int k){
        String res = "";
        int len = s.length();
        for(int i = 0; i < len; i++){
            res+= decrypt(s.charAt(i), k);
        }

        return res;
    }

}
