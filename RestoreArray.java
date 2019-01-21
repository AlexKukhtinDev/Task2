import java.util.Arrays;

public class RestoreArray {
    public static void main(String[] args) {
        int[] restor = {1, -1, 3, -2, 7, 6, -1, 4, 3, 2};
        restor = restoreArray(restor);
        System.out.print("This is positive number: " + Arrays.toString(restor));
    }

    private static int[] restoreArray(int[] restore) {
        for (int i = 0; i < restore.length; i++) {
            if (0 < i && 0 > restore[i - 1]) {
                restore[i - 1] = restore[i] - (restore[i] - restore[i - 2]) / 2;
            }
        }
        return restore;
    }
}