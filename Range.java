import java.util.ArrayList;
import java.util.List;

class Range {
  static  int anInt;
  static int start;
   static StringBuilder sb = new StringBuilder();
private static void range(int[] number ){

    for (int i = 0; i < number.length; i++){
        if ( 0 < i) {
            anInt = number[i] - number[i - 1];
            if(1 == anInt && 0 == start){
                start = 1;
                sb.append("[").append(number[i-1]);
            }
            if (1 != anInt && 0 == start) {
                sb.append("[").append(number[i - 1]).append("]");
            }
            if (1 !=  anInt&& 1 == start){
                sb.append(" ").append(number[i - 1]).append("]");
                start = 0;
            }
            if(1 == start && i + 1 == number.length){
                sb.append(" ").append(number[i]).append("]");
            }
        }
    }
    System.out.println(sb.toString());
}

    public static void main(String[] args) {
    int [] a = {1, 2, 3, 5, 8, 9, 10, 13, 14, 15, 16};
        Range.range(a);
    }
}
