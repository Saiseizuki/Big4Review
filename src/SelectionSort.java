/**
 * Created by xcptan on 07/07/2016.
 */
public class SelectionSort {

    public int[] sort(int[] array){

        int length = array.length;

        System.out.println("Selection sort: ");
        for (int i = 0; i < length; i++) {

            for (int j = 0; j < length; j++) {
                System.out.print(array[j] + " ");
            }
            System.out.println();

            int indexOfMin = indexOfMin(i,array);
            int temp = array[i];
            array[i] = array[indexOfMin];
            array[indexOfMin]=temp;


        }
        return array;
    }

    private int indexOfMin(int start, int[] array){
        int min = Integer.MAX_VALUE;
        int index = -1;


        int length = array.length;
        for (int i = start; i < length; i++) {
            if (array[i] <= min){
                index = i;
                min = array[i];
            }
        }

        return index;
    }
}
