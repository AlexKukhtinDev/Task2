class Range {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5, 8, 9, 10, 13, 14, 15, 16, 18};
        range(array);
    }

    private static void range(int[] arr) {
        int prev = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] - prev) != 1) {
                System.out.println(" ");
            }
            System.out.print(arr[i] + " ");
            prev = arr[i];
        }
    }
}
