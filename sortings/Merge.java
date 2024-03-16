import java.util.*;
public class Merge {
    public static void MergeSort(int[] arr)
    {
        ms(arr, 0, arr.length-1);
    }
    public static void ms(int[] arr, int low, int high)
    {
        if(low >= high) return;
        int mid = (low + high)/2;
        ms(arr, low, mid);
        ms(arr, mid+1, high);
        mrgSort(arr, low, mid, high);
    }
    public static void mrgSort(int[] arr, int low, int mid, int high)
    {
        List<Integer> temp = new ArrayList<>();
        int left = low, right = mid+1;
        while(left <= mid && right <= high)
        {
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            } 
            else {
                temp.add(arr[right]);
                right++;
            }
        }
        while(left <= mid)
        {
            temp.add(arr[left++]);
        }
        while(right <= high)
        {
            temp.add(arr[right++]);
        }

        for(int i=low; i<=high; i++)
        {
            arr[i] = temp.get(i-low);
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,1,4,3,6,5};
        System.out.println("array before sorting :- "+ Arrays.toString(arr));
        // mergeSort(arr, 0, 6-1);
        MergeSort(arr);
        System.out.println("array after sorting :- "+ Arrays.toString(arr));
    }
    // private static void merge(int[] arr, int low, int mid, int high) {
    //     ArrayList<Integer> temp = new ArrayList<>(); // temporary array
    //     int left = low;      // starting index of left half of arr
    //     int right = mid + 1;   // starting index of right half of arr

    //     //storing elements in the temporary array in a sorted manner//

    //     while (left <= mid && right <= high) {
    //         if (arr[left] <= arr[right]) {
    //             temp.add(arr[left]);
    //             left++;
    //         } else {
    //             temp.add(arr[right]);
    //             right++;
    //         }
    //     }

    //     // if elements on the left half are still left //

    //     while (left <= mid) {
    //         temp.add(arr[left]);
    //         left++;
    //     }

    //     //  if elements on the right half are still left //
    //     while (right <= high) {
    //         temp.add(arr[right]);
    //         right++;
    //     }

    //     // transfering all elements from temporary to arr //
    //     for (int i = low; i <= high; i++) {
    //         arr[i] = temp.get(i - low);
    //     }
    // }

    // public static void mergeSort(int[] arr, int low, int high) {
    //     if (low >= high) return;
    //     int mid = (low + high) / 2 ;
    //     mergeSort(arr, low, mid);  // left half
    //     mergeSort(arr, mid + 1, high); // right half
    //     merge(arr, low, mid, high);  // merging sorted halves
    // }
}
