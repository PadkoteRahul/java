import java.util.*;
class Selection{
    public static void selectionSort(int[] arr)
    {
        int n = arr.length;
        int mini = 0;
        for(int i=0; i<=n-2; i++)
        {
            mini = i;
            for(int j=i; j<=n-1; j++)
            {
                if(arr[j] < arr[mini])
                {
                    mini = j;
                }
            }
            swap(arr, i, mini);
        }
    }
    public static void swap(int[] arr, int i, int mini)
    {
        int temp = arr[i];
        arr[i] = arr[mini];
        arr[mini]= temp;
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int[] arr = {2,1,4,3,6,5};
        System.out.println("array before sorting :- "+ Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("array after sorting :- "+ Arrays.toString(arr));
    }
}