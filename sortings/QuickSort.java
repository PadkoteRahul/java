import java.util.*;
public class QuickSort {
    public static void Quicksort(int[] arr, int low, int high)
    {
        if(low < high){
            int p = partition(arr, low, high);
            Quicksort(arr, low, p-1);
            Quicksort(arr, p+1, high);
        }
    }
    public static int partition(int[] arr, int low, int high)
    {
        int pivot = arr[low];
        int i = low;
        int j = high;
        while(i<j)
        {
            while(arr[i] <= pivot && i <= high-1) i++;
            while(arr[j] > pivot && j >= low+1) j--;
            if(i<j) swap(arr, i, j);
        }
        swap(arr, low, j);
        return j;
    }
    public static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {2,1,4,3,6,5};
        System.out.println("array before sorting :- "+ Arrays.toString(arr));

        Quicksort(arr, 0, arr.length-1);
        System.out.println("array after sorting :- "+ Arrays.toString(arr));
    }
}
