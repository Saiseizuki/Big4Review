/**
 * Created by xcptan on 29/07/2016.
 */
public class StringPermutation {

    public static void main (String[] args){
        printPermutations("ABCDE","");
    }


    private boolean isPalindrome(String input){
        for(int i=0, j=input.length()-1; i < (input.length()/2); j--,    i++){
            if(input.charAt(i) != input.charAt(j)){
                return false;
            }
        }
        return true;
    }

    static void printPermutations(String str, String prefix){
        //Base case
        if(str.length() == 0){
            System.out.println(prefix);
            return;
        }else{
            for (int i = 0; i < str.length(); i++) {
                String rem = str.substring(0,i)+str.substring(i+1);
                printPermutations(rem,prefix+str.charAt(i));
            }
        }
    }
}
