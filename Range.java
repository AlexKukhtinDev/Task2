import java.util.ArrayList;
import java.util.Arrays;

public class Range {
    public static void main(String[] args) {
        //input array
        int arr[] = {1, 2, 3, 5, 8, 9, 10, 13, 14, 15, 16, 18};
        ArrayList<Integer>[] result = new ArrayList[arr.length];
        int prev = 0;

        for (int i = 0, k = 0; i < arr.length; i++) {
            if ((arr[i] - prev) != 1) {
                k++;
            }

            if (result[k] == null) {
                result[k] = new ArrayList<Integer>();
            }

            result[k].add(arr[i]);
            prev = arr[i];
        }

        for (ArrayList<Integer> arrayList : result) {
            if (arrayList != null) {
                System.out.print(Arrays.toString(formResult(arrayList)));
            }
        }
    }

    public static Integer[] formResult(ArrayList<Integer> arr) {
        Integer[] res;

        if (arr == null || arr.toArray().length == 0) {
            return new Integer[0];
        }

        if (arr.toArray().length > 1) {
            res = new Integer[2];

            res[0] = (int) arr.toArray()[0];
            res[1] = (int) arr.toArray()[arr.toArray().length - 1];

            return res;
        }

        res = new Integer[1];
        res[0] = (int) arr.toArray()[0];


        return res;
    }
}