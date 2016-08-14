/**
 * Created by xcptan on 13/07/2016.
 */
public class Series {


    public int factorialRec(int n){
        if(n==0) {
            return 1;
        }
        else{
            return n * factorialRec(n-1);
        }
    }

    public int factorialIter(int n){
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result*=i;
        }
        return result;
    }

    public int fibonacciRec(int n){

        if(n== 1 || n==2){
            return 1;
        }

        //fib3 + fib 4 >> fib2 + fib 3 >> fib1+ fib 2
        //fib1 + fib 2

        return fibonacciRec(n-2) + fibonacciRec(n-1);
    }

    public int fibonacciIter(int n){
        int prev = 1;
        int curr = 1;

        if(n == 1 || n == 2){
            return 1;
        }

        //

        else{
            // 1 1 2 3 5 8
            for (int i = 2; i < n; i++) {
                int temp = curr;
                curr = prev+curr;
                prev = temp;
            }
            return curr;
        }
    }

    public void permutation (String string){
        permutation (string,"");
    }

    public void permutation(String string, String pivot){
        if(string.length() == 0){
            System.out.println(pivot);
        }

        else{

            for (int i = 0; i < string.length(); i++) {
                String rem = string.substring(0,i) + string.substring(i+1);
                System.out.println("String: "+ string +" i: " + i + " : "+ string.charAt(i) +" : "+ rem+ " prefix: "+pivot);
                permutation(rem,pivot+ string.charAt(i));

            }
        }


    }

}
