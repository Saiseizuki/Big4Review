/**
 * Created by xcptan on 08/07/2016.
 */
public class QuickSort {

    public int[] sort(int[] array){
        return quickSort(array,0,array.length-1);
    }

    private int[] quickSort(int[] array,int start,int end){

        if(start<end){
            PartitionResult partitionResult = partition(array,start,end);
            int partitionIndex = partitionResult.partitionIndex;
            array = partitionResult.result;
            array = quickSort(array,start,partitionIndex-1);
            array = quickSort(array,partitionIndex+1,end);
        }


        return array;
    }

    private PartitionResult partition (int[] array, int start, int end){
        int pivot = array[end];
        int pivotIndex = start;

        for(int i = start; i < end;i++){
            if(array[i] <= pivot){
                array = swap(array,i,pivotIndex);
                pivotIndex++;
            }
        }

        array = swap(array,pivotIndex,end);

        PartitionResult partitionResult = new PartitionResult();
        partitionResult.partitionIndex = pivotIndex;
        partitionResult.result = array;



        System.out.println("Quick sort:");
        for (int z = 0; z < array.length; z++) {
            System.out.print(array[z] + " ");
        }
        System.out.println();
        return partitionResult;
    }

    private int[] swap(int[] array, int a, int b){
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
      return array;
    };

    private class PartitionResult{
        int partitionIndex;
        int[] result;
    }
}
