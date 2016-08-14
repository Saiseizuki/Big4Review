/**
 * Created by xcptan on 11/07/2016.
 */
public class Fibonacci {

    //1 1 2 3 5 8 13 21
    public int fibonacci(int n){
        int sum = 0;
        int prev = 1;
        for (int i = 0; i < n; i++) {
            if(i==0 || i==1){
                sum = 1;
            }
            else if(i==2){
                sum++;
            }
            else{
                sum+=prev;
                prev = sum;
            }

            System.out.print(sum + " ");
        }
        System.out.println();
        return sum;
    }
}
