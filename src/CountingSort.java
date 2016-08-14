/**
 * Created by xcptan on 15/07/2016.
 */
public class CountingSort {

    public int[] sort(int[] input) {
        int[] middle = new int[input.length+1];
        int[] output = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            middle[input[i]]++;
        }

        for (int i = 0; i < middle.length - 1; i++) {
            middle[i + 1] += middle[i];
        }
////
        for (int i = 0; i < input.length; i++) {
            output[middle[input[i]]-1] = input[i];
        }

        System.out.println("Counting sort:");
        for (int z = 0; z < output.length; z++) {
            System.out.print(output[z] + " ");
        }
        System.out.println();

        return output;
    }

    ;
}
