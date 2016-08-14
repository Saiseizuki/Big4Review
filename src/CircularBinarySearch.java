import java.util.Scanner;

/**
 * Created by xcptan on 03/08/2016.
 */
public class CircularBinarySearch {

    public static void main (String[] args){
        int[] A = new int[]{12,14,18,21,3,6,8,9};

        while (true) {
            Scanner scanner = new Scanner(System.in);
            int input =  scanner.nextInt();

            int index = findIndexInCircularArray(A, input);
            if(index == -1){
                System.out.println(input + " not found");
            }else {
                System.out.println(input + " index is " + index);
            }
        }
    }

    public static int findIndexInCircularArray(int[] A, int n){
        int low = 0;
        int high = A.length-1;

        while(low <= high) {
            int mid = (low + high) / 2;

            if (A[mid] == n) {
                return mid;
            }
            if (A[mid] <= A[high]) { //Right half is sorted
                if(n > A[mid] && n <= A[high]){ //start searching in right half
                    low = mid+1;
                }else{
                    high = mid-1;
                }

            }else{
                if(n < A[mid] && n >= A[low]){ //start searching in right half
                    high = mid-1;
                }else{
                    low = mid+1;
                }
            }
        }

        return -1;
    }
}
