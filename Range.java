public class Range {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5, 8, 9, 10, 13, 14, 15, 16, 18};
        range(array.length, array);
    }

    private static void range(int length, int[] array) {
        if (length < 1) {
            return;
        }
        StringBuilder res = new StringBuilder();
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < length; i++) {
            if ((max + 1) == array[i]) {
                max++;
            } else {
                appendRange(res, min, max);
                min = array[i];
                max = array[i];
            }
            if (i == length - 1) {
                appendRange(res, min, max);
            }
        }
        System.out.println(res);
    }

    private static void appendRange(StringBuilder result, int minR, int maxR) {
        result.append("[");
        if (minR == maxR) {
            result.append(minR);
        } else {
            result.append(minR);
            result.append(" ");
            result.append(maxR);
        }
        result.append("]");
    }
}