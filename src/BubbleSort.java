/**
 * Created by xcptan on 07/07/2016.
 */
public class BubbleSort {

    public int[] sort(int[] array){

        int length = array.length;

        System.out.println("Bubble sort: ");

        boolean hasSwapped;
        int passes =0;
        do {
            hasSwapped = false;
            for (int i = 0; i < length - 1; i++) {

                if (array[i] > array[i + 1]) {
                    System.out.println("Swapping "+array[i]+" with "+array[i+1]);
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    hasSwapped = true;

                }


                for (int j = 0; j < length; j++) {
                    System.out.print(array[j] + " ");
                }
                System.out.println();
            }
            passes++;

            System.out.println("Pass#"+passes);
        }while(hasSwapped);
        return array;
    }
}
