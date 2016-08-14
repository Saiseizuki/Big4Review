/**
 * Created by xcptan on 11/08/2016.
 */
public class ReverseInteger {

    public static void main(String[] args) {
        int input = 10012300;
        System.out.println(reverseInteger(input));
    }

    public static int reverseInteger(int input) {
        int total = 0;
        while(input > 0) {
            int remainder = input % 10;
            total = total * 10 + remainder;
            input = input / 10;
        }

        return total;
    }
}
