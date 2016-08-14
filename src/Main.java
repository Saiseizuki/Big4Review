public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        int[] entries = new int[]{1, 3, 5, 7, 14, 19, 22, 30, 54};

        int input = 30;
        System.out.println("Index of " + input + " is " + new Main().findIndexOf(entries, input));

        float hour = 6f;
        float minute = 0f;

        float minuteAngle = 360 * (minute / 60);
        float hourAngle = (360 * ((hour % 12) / 12)) + ((360 * (minute / 60)) * (1 / 12));

        float angleDiff = (minuteAngle - hourAngle) % 360;

        System.out.println(angleDiff);

        SubsetSum subsetSum = new SubsetSum();
        boolean test = subsetSum.isSubsetSum(new int[]{3, 34, 4, 12, 5, 2}, 6, 9);
        System.out.print(test);

        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(new int[]{3, 34, 4, 12, 5, 2});

        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(new int[]{2, 7, 4, 1, 5, 3});

        SelectionSortShorter selectionSortShorter = new SelectionSortShorter();
        selectionSortShorter.sort(new int[]{2, 7, 4, 1, 5, 3});

        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort(new int[]{2, 7, 4, 1, 5, 3});

        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(new int[]{2, 7, 4, 1, 5, 3, 6, 8});

        QuickSort quickSort = new QuickSort();
        quickSort.sort(new int[]{2, 7, 4, 1, 5, 3, 6, 8});

        CountingSort countingSort= new CountingSort();
        countingSort.sort(new int[]{4, 2, 3, 1, 5});

        Fibonacci fibonacci = new Fibonacci();
        fibonacci.fibonacci(5);

        DFS DFS = new DFS();
        DFS.depthFirstSearch(new int[][]{
                {0, 0, 1, 0, 1, 0, 1, 0, 0},
                {0, 0, 1, 1, 0, 0, 0, 0, 1},
                {1, 1, 0, 0, 1, 0, 0, 0, 1},
                {0, 1, 0, 0, 0, 1, 1, 1, 0},
                {1, 0, 1, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 1, 0, 1},
                {1, 0, 0, 1, 0, 1, 0, 0, 0},
                {1, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 1, 1, 0, 0, 1, 0, 0, 0}
        });

        BFS bfs = new BFS();
        bfs.breadthFirstSearch(new int[][]{
                {0, 0, 1, 0, 1, 0, 1, 0, 0},
                {0, 0, 1, 1, 0, 0, 0, 0, 1},
                {1, 1, 0, 0, 1, 0, 0, 0, 1},
                {0, 1, 0, 0, 0, 1, 1, 1, 0},
                {1, 0, 1, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 1, 0, 1},
                {1, 0, 0, 1, 0, 1, 0, 0, 0},
                {1, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 1, 1, 0, 0, 1, 0, 0, 0}
        });

//        SingaporeSki singaporeSki = new SingaporeSki();
//        singaporeSki.main();

        Series series = new Series();
        System.out.println("Factorial Recursion: ");
        System.out.println(series.factorialRec(5));
        System.out.println("Factorial Iterative: ");
        System.out.println(series.factorialIter(5));

        System.out.println("Fibonacci Rec: ");
        System.out.println(series.fibonacciRec(10));

        System.out.println("Fibonacci Iter: ");
        System.out.println(series.fibonacciIter(10));

        System.out.println("String permutation: ");
        series.permutation("AB");

    }

    private int findIndexOf(int[] entries, int value) {
        int start = 0;
        int end = entries.length - 1;

        while (true) {

            int m = (int) Math.floor((start + end) / 2);

            if (start > end) {
                System.out.println("Array is not sorted, terminating...");
                return -1;
            }

            if (value == entries[m]) {
                return m;
            }

            if (entries[m] < value) {
                start = m + 1;
            }

            if (value < entries[m]) {
                end = m - 1;
            }
        }
    }
}
