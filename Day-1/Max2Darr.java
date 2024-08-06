public class Max2Darr {
    public static void main(String[] args) {
        int[][] n = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        System.out.println("Max : "+findMax(n));
    }

    static int findMax(int[][] arr) {

        if (arr.length == 0) {
            return -1;
        }

        int max = arr[0][0];
        for (int[] arr1 : arr) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[j] > max) {
                    max = arr1[j];
                }
            }
        }

        return max;

    }
}
