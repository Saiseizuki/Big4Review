/**
 * Created by xcptan on 11/08/2016.
 */
public class BitAdd {

    public static void main(String[] args) {
        BitAdd bitAdd = new BitAdd();
        System.out.println(bitAdd.add(10, 10));
        System.out.println(bitAdd.addRecurse(1123, 465));
    }

    public int addRecurse(int a, int b) {
        if (b != 0) {
            int sum = a ^ b;
            int carry = (a & b) << 1;
            return addRecurse(sum,carry);
        }else{
            return a;
        }
    }

    public int add(int a, int b) {

        while (b != 0) {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }

        return a;
    }
}
