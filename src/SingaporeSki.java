import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by xcptan on 12/07/2016.
 */
public class SingaporeSki {

    List<Integer> longest = new ArrayList<Integer>();

    public void main() {

        File f = new File("src/map.txt");
        try {
            InputStream inputStream = new FileInputStream(f);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String[] size = bufferedReader.readLine().split(" ");
            int[][] mountain = new int[Integer.parseInt(size[0])][Integer.parseInt(size[1])];
            for (int i = 0; i < mountain.length; i++) {
                String[] peaks = bufferedReader.readLine().split(" ");
                for (int j = 0; j < peaks.length; j++) {
                    mountain[i][j] = Integer.parseInt(peaks[j]);
                }
            }

            for (int i = 0; i < mountain.length; i++) {
                for (int j = 0; j < mountain[i].length; j++) {
                    Result result = ski(new Result(), j, i, mountain);

//                    if(this.longest.size() <= result.getLongest().size()) {
//                        printList(result);
//                    }

                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public Result ski(Result result, int currX, int currY, int[][] mountain) {

        int val = mountain[currY][currX];

        result.getCurrent().add(val);
        if (currX > 0 && mountain[currY][currX - 1] < val) {
            ski(result, currX - 1, currY, mountain);
            if (result.getLongest().size() <= result.getCurrent().size() && this.longest.size() <= result.getCurrent().size()) {
                printList(result);

                List<Integer> longest = new ArrayList<Integer>();
                longest.addAll(result.getCurrent());
                result.setLongest(longest);
            }
            result.getCurrent().remove(result.getCurrent().size() - 1);
        }
        if (currX < mountain[currY].length - 1 && mountain[currY][currX + 1] < val) {
            ski(result, currX + 1, currY, mountain);
            if (result.getLongest().size() <= result.getCurrent().size() && this.longest.size() <= result.getCurrent().size()) {
                printList(result);

                List<Integer> longest = new ArrayList<Integer>();
                longest.addAll(result.getCurrent());
                result.setLongest(longest);
            }
            result.getCurrent().remove(result.getCurrent().size() - 1);
        }
        if (currY > 0 && mountain[currY - 1][currX] < val) {
            ski(result, currX, currY - 1, mountain);
            if (result.getLongest().size() <= result.getCurrent().size() && this.longest.size() <= result.getCurrent().size()) {
                printList(result);

                List<Integer> longest = new ArrayList<Integer>();
                longest.addAll(result.getCurrent());
                result.setLongest(longest);
            }
            result.getCurrent().remove(result.getCurrent().size() - 1);
        }
        if (currY < mountain.length - 1 && mountain[currY + 1][currX] < val) {
            ski(result, currX, currY + 1, mountain);
            if (result.getLongest().size() <= result.getCurrent().size() && this.longest.size() <= result.getCurrent().size()) {
                printList(result);

                List<Integer> longest = new ArrayList<Integer>();
                longest.addAll(result.getCurrent());
                result.setLongest(longest);
            }
            result.getCurrent().remove(result.getCurrent().size() - 1);
        }

        return result;
    }

    private void printList(Result result) {
        for (int k = 0; k < result.getLongest().size(); k++) {
            System.out.print(result.getLongest().get(k) + " ");
        }
        this.longest = result.getLongest();
        if (result.getLongest().size() > 0) {
            int steep = result.getLongest().get(0) - result.getLongest().get(result.getLongest().size() - 1);
            System.out.println("\nSize: " + result.getLongest().size() + " Deepness: " + steep);
        }
    }

    public class Result {
        List<Integer> longest = new ArrayList<Integer>();
        List<Integer> current = new ArrayList<Integer>();

        public List<Integer> getLongest() {
            return longest;
        }

        public List<Integer> getCurrent() {
            return current;
        }

        public void setLongest(List<Integer> longest) {
            this.longest = longest;
        }
    }


}
