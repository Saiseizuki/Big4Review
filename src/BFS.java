import java.util.ArrayList;
import java.util.List;

/**
 * Created by xcptan on 19/07/2016.
 */
public class BFS {
    int[] breadthFirstSearch(int[][] matrix){
        List list = new ArrayList<Integer>();

        //Initially start at 0 and mark as discovered
        //Add to results
        list.add(0);
        //Mark as discovered using the matrix diagonals
        matrix[0][0] = 1;

        return discoverImmediate(list,0,matrix);
    }

    int []  discoverImmediate(List<Integer> results, int vertex, int[][] matrix){

        //Base case
        if(results.size() == matrix[vertex].length){
            int[] ret = new int[results.size()];
            for (int i = 0; i < results.size(); i++) {
                ret[i] = results.get(i);
                System.out.println("*** BFS *** Result "+ (ret[i]+1));
            }
            return ret;
        }

        for (int i = 0; i < matrix.length; i++) {
            //Has connection and undiscovered
            if( i!= vertex && matrix[vertex][i] == 1 && matrix[i][i] == 0){
                //Add to results
                results.add(i);
                System.out.println("*** BFS *** Discovered " + i );
                //Mark as discovered using the matrix diagonals
                matrix[i][i] = 1;

                discoverImmediate(results,i,matrix);
            }

            else if( i!= vertex && matrix[vertex][i] == 1 && matrix[i][i] == 1){
                System.out.println("*** BFS *** Already discovered "+ (i+1) + " skipping...");
            }
        }

        return new int[0];
    }
}
