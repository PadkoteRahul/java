import java.util.*;

class Bubble{
    public static void BubbleSort(int[] arr)
    {
        int n = arr.length;
        for(int i=n-1; i>0; i--)
        {
            for(int j=0; j<i; j++)
            {
                if(arr[j] > arr[j+1])
                    swap(arr, i, j);
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
        BubbleSort(arr);
        System.out.println("array after sorting :- "+ Arrays.toString(arr));
    }
}