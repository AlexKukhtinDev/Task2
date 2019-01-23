import java.util.Arrays;

public class RestoreArray {
    public static void main(String[] args) {
        int[] array = {1, -1, 3, -2, 7, 6, -1, 4, 3, 2};
        array = restoreArray(array);
        System.out.print("This is positive number: " + Arrays.toString(array));
    }

    private static int[] restoreArray(int[] restore) {
        int[] result = Arrays.copyOf(restore, restore.length);
        for (int i = 0; i < result.length; i++) {
            if (0 < i && 0 > result[i - 1]) {
                result[i - 1] = result[i] - (result[i] - result[i - 2]) / 2;
            }
        }

        return result;
    }
}