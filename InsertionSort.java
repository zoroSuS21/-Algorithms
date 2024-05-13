public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {30, 39, 11, 57, 42, 96};
        insertionSort(array);
        System.out.println("Ascending order(Sorted array): ");
        for (int Number : array) { 
            System.out.print(Number + " ");
        }
    }

    public static void insertionSort(int[] ary) {
        int n = ary.length;
        for (int i = 1; i < n; ++i) {
            int key = ary[i];
            int j = i - 1;

            while (j >= 0 && ary[j] > key) {
                ary[j + 1] = ary[j];
                j = j - 1;
            }
            ary[j + 1] = key;
        }
    }
}