/**
 * Created by xcptan on 03/08/2016.
 */
public class SpiralTraverse {
    public static void main (String[] args){
        int[][] A = new int[][]{
                {2,4,6,8},
                {5,9,12,16},
                {2,11,5,9},
                {3,2,1,8}

        };

        int top = 0;
        int bottom = A.length-1;
        int left = 0;
        int right = A[0].length-1;

        int entries = A.length*A[0].length;

        Direction currDir = Direction.RIGHT;

        int ctr = 0;
        while(ctr < ((entries) -1)){

            if(currDir.equals(Direction.RIGHT)) {
                for (int j = left; j <= right; j++) {
                    System.out.print(A[top][j] + " ");
                }
                top++;
                currDir = Direction.DOWN;
            }

            if(currDir.equals(Direction.DOWN)) {
                for (int j = top; j <= bottom; j++) {
                    System.out.print(A[j][right] + " ");
                }
                right--;
                currDir = Direction.LEFT;
            }

            if(currDir.equals(Direction.LEFT)) {
                for (int j = right; j >= left; j--) {
                    System.out.print(A[bottom][j] + " ");
                }
                bottom--;
                currDir = Direction.UP;
            }


            if(currDir.equals(Direction.UP)) {
                for (int j = bottom; j >= top; j--) {
                    System.out.print(A[j][left] + " ");
                }
                left++;
                currDir = Direction.RIGHT;
            }

            ctr++;
        }

    }
    public enum Direction {
        RIGHT,
        DOWN,
        LEFT,
        UP
    }


}
