/**
 * Created by xcptan on 07/07/2016.
 */
public class InsertionSort {

    public int[] sort (int[] array){

        System.out.println("Insertion sort: ");

        for (int i = 1; i < array.length; i++) {


            int anchor = i;
            int value = array[i];

            while(anchor > 0 && value < array[anchor-1]){
                array[anchor]=array[anchor-1];
                anchor--;
            }

            array[anchor]=value;


            for (int j = 0; j < array.length; j++) {
                System.out.print(array[j] + " ");
            }
            System.out.println();
        }

        return array;
    }
}
