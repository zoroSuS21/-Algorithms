public class BubbleSort {
    public static void bubbleSort(int[] ar) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (ar[j] > ar[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = ar[j];
                    ar[j] = ar[j + 1];
                    ar[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] ar = {81, 50, 21, 11, 29, 9, 89};
        bubbleSort(ar);
        System.out.println("Sorted array : ");
        for (int Number : ar) {
            System.out.print(Number + " ");
        }
        System.out.println();
    }
}