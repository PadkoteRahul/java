// an example of using a generic type parameter in both methods and classes. Let's start with a generic method:
import java.util.*;
class Generic_Method
{
    public  static <T> void  display  (T[] arr)
    {
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        Integer[] arr =  {1,2,3,4};
        String[] strarr = {"abc", "def", "ghi"};
        display(arr);
        display(strarr);

    }
}