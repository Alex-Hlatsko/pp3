import java.util.Arrays;

public class Alphabet{

    static boolean isAlphabet(String t){
        String oldString = t;
        char[] tArray = t.toCharArray();
        Arrays.sort(tArray);
        t = new String(tArray);
        if(oldString.equals(t)){
            return true;
        } else{
            return false;
        } 

    }
    public static void main(String[] args){
        Alphabet.isAlphabet("abegsw"); // => true 
        Alphabet.isAlphabet("abcmhsw"); // => false
    }

}