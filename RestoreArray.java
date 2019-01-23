import java.util.Arrays;

public class RestoreArray {
    public static void main(String[] args) {
        int[] array = {1, -1, 3, -2, 7, 6, -1, 4, 3, 2};
        array = restoreArray(array);
        System.out.print("This is positive number: " + Arrays.toString(array));
    }

    private static int[] restoreArray(int[] restore) {
        int[] result;
        for (int i = 0; i < restore.length; i++) {
            if (0 < i && 0 > restore[i - 1]) {
                restore[i - 1] = restore[i] - (restore[i] - restore[i - 2]) / 2;
            }
        }
        result = Arrays.copyOf(restore, restore.length);
        return result;
    }
}