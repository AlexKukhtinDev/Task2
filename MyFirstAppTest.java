public class MyFirstAppTest {
    public static int[] rotate(int[] nums, int k) {
        if(k > nums.length)
            k=k%nums.length;

        int[] result = new int[nums.length];
        System.arraycopy( nums, k, result, 0, nums.length - k );
        System.arraycopy( nums, 0, result, nums.length - k , k );

        //Case 1: The rotated array will be assigned to the given array "nums"
        nums = result;
        for (int i=0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

        return result; //Case 2: method returns the rotated array
    }
    public static void main(String[] args) {

        int [] arr1 = {5,6,1,2,6};
        MyFirstAppTest.rotate(arr1,2);


    }

}
