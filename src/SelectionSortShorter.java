/**
 * Created by xcptan on 07/07/2016.
 */
public class SelectionSortShorter {

    public int[] sort(int[] array){
    //  [0][1][2][3] indeces
    //  3  4  1  2 array
        System.out.println("SelectionShort sort: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if(array[i] < array[j]){
                    System.out.println(array[j] +" swapping "+ array[i]);
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;

                    for (int k = 0; k < array.length; k++) {
                        System.out.print(array[k] + " ");
                    }
                    System.out.println();
                }
            }
        }
        return array;
    }
}
