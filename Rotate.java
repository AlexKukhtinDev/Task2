import java.util.Arrays;

public class Rotate {
    static int[] rotate(int[] nums, int k) {
        if (k > nums.length) {
            k = k % nums.length;
        }
        int[] result = new int[nums.length];
        System.arraycopy(nums, k, result, 0, nums.length - k);
        System.arraycopy(nums, 0, result, nums.length - k, k);
        return result;
    }

    public static void main(String[] args) {
        int[] array = {5, 6, 1, 2, 6};
        System.out.println(Arrays.toString(rotate(array, 2)));
    }
}
