/**
 * Created by xcptan on 08/07/2016.
 */
public class MergeSort {

    public int[] sort (int[] array){

        //Break down array by 2 until array size is 1
        if(array.length < 2 ) return array;

        int middle = array.length/2;

        int[] arrayA = new int[middle];

        for (int i = 0; i < middle; i++) {
            arrayA[i] = array[i];
        }

        int[] arrayB = new int[array.length-middle];

        for (int i = middle; i < array.length; i++) {
            arrayB[i-middle] = array[i];
        }

        arrayA = sort(arrayA);
        arrayB = sort(arrayB);
        return combine(arrayA, arrayB);
    }

    private int[] combine (int[]arrayA, int[] arrayB){
        int length = arrayA.length+arrayB.length;
        int[] combined = new int[length];

        int i =0;
        int j =0;
        int k = 0;

        while(i < arrayA.length && j < arrayB.length) {
            if (arrayA[i] <= arrayB[j]){
                combined[k] = arrayA[i];
                i++;
            }

            else {
                combined[k] = arrayB[j];
                j++;
            }


            k++;
        }

        while (i < arrayA.length){
            combined[k] = arrayA[i];
            k++;
            i++;
        }

        while (j < arrayB.length){
            combined[k] = arrayB[j];
            k++;
            j++;
        }


        System.out.println("Merge sort:");
        for (int z = 0; z < combined.length; z++) {
            System.out.print(combined[z] + " ");
        }
        System.out.println();

        return combined;
    }
}
