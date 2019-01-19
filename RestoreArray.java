import java.sql.Array;
import java.util.Arrays;

class RestoreArray {
     public static void main(String[] args) {
         int [] restor = {1, -1, 3 ,-2 ,7 ,6, -1 , 4,3 ,2};
         RestoreArray.restoreArray(restor);
     }
    private static void restoreArray(int[]restore){

        System.out.println("This is arrays " + Arrays.toString(restore));
        for (int i = 0; i < restore.length; i++) {

            if (0 < i && 0 > restore[i - 1]) {
                restore[i - 1] = restore[i] - (restore[i] - restore[i - 2]) / 2;
            }
        }
        System.out.print("This is positive number: " + Arrays.toString(restore));

}




}
