/**
 * Created by xcptan on 15/07/2016.
 */
public class DFS {
    int [] depthFirstSearch(int[][] matrix){

        return depthFirstSearch(0, new int[matrix.length], matrix);
    }

    int [] depthFirstSearch(int curr, int[] result, int[][] matrix) {
        int isDiscovered = matrix[curr][curr];

        //Mark as discovered
        if(isDiscovered == 0) {

            System.out.println("*** DFS *** Discovered "+ (curr+1));
            //Discovered
            matrix[curr][curr] = Integer.MAX_VALUE;

            for(int i = 0; i< matrix[curr].length;i++){
                if(matrix[curr][i] == 1 && curr != i) {
                    depthFirstSearch(i, result, matrix);
                }
            }
        }else{
            System.out.println("*** DFS *** Already discovered "+ (curr+1) + " backtracking...");
        }

        return result;

    }

}
