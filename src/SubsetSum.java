/**
 * Created by xcptan on 06/07/2016.
 */
public class SubsetSum {

    public boolean isSubsetSum(int[] set, int n, int sum){


        if(sum==0){
            return true;
        }

        if(n==0 && sum > 0){
            return false;
        }

        //Skip to next number
        if(set[n-1] > sum){
            return isSubsetSum(set,n-1,sum);
        }


        return isSubsetSum(set,n-1,sum) || isSubsetSum(set,n-1,sum-set[n-1]);
    }
}
