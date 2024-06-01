// Java programming code for Selection Sort
import java.io.*;
public class SelectionSort
{
    void sort(int arr[])
    {
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int MinIndex = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[MinIndex])
                MinIndex = j;

            // Swap the found minimum element with the first
            int temp = arr[MinIndex];
            arr[MinIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // Prints the array
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] +" ");
        System.out.println();
    }

    public static void main(String args[])
    {
        SelectionSort ob = new SelectionSort();
        int arr[] = {59,19,11,25,7};
        ob.sort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }
}