public class Rotate {
    private static int[] rotate(int[] nums, int k) {
        if (k > nums.length) {
            k = k % nums.length;
        }
        int[] result = new int[nums.length];
        System.arraycopy(nums, k, result, 0, nums.length - k);
        System.arraycopy(nums, 0, result, nums.length - k, k);
        result = nums;
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {5, 6, 1, 2, 6};
        for (int array : Rotate.rotate(arr1, 2)) {
            System.out.print(array + " ");
        }
    }
}
