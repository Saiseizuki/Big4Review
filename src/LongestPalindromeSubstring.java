/**
 * Created by xcptan on 29/07/2016.
 */
public class LongestPalindromeSubstring {
    // Iterative approach

    public static void main(String[] args) {
        String input = "annananvnnansdlkqwnenadlknkcncnancancvananannananav";
        String max = "";

        int start = 0;
        int end = 0;
        for (int i = 0; i < input.length(); i++) {
            int len1 = getLongestPalindromeLength(input,i,i);
            int len2 = getLongestPalindromeLength(input,i,i);
            int len = Math.max(len1,len2);
            if(len > end-start){
                start = i - len/2;
                end = i + len/2;
            }
        }

        System.out.println("Longest palindromic substring is: " + input.substring(start,end+1));
    }

    public static int getLongestPalindromeLength(String s, int left, int right) {
        int start = left;
        int end = right;
        while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
            start--;
            end++;
        }
        return end - start -1;
    }

}
