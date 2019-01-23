import java.util.Arrays;

public class Rotate {
    public static int[] rotate(int[] array, int k) {
        if (k > array.length) {
            k = k % array.length;
        }
        int[] result = new int[array.length];
        System.arraycopy(array, k, result, 0, array.length - k);
        System.arraycopy(array, 0, result, array.length - k, k);
        return result;
    }

    public static void main(String[] args) {
        int[] array = {5, 6, 1, 2, 6};
        System.out.println(Arrays.toString(rotate(array, 2)));
    }
}
