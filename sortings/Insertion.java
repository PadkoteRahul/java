import java.util.*;
public class Insertion {
    public static void InsertionSort(int[] arr)
    {
        int n = arr.length;
        for(int i=0; i<n-1; i++)
        {
            int j = i+1;
            while(j>0 && arr[j] < arr[j-1])
            {
                swap(arr, i, j);
                j--;
            }
        }
        
    }
    public static void swap(int[] arr, int i, int mini)
    {
        int temp = arr[i];
        arr[i] = arr[mini];
        arr[mini]= temp;
    }
    public static void main(String[] args) {
        int[] arr = {2,1,4,3,6,5};
        System.out.println("array before sorting :- "+ Arrays.toString(arr));
        InsertionSort(arr);
        System.out.println("array after sorting :- "+ Arrays.toString(arr));
    }
}
