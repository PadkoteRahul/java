import java.util.ArrayList;
import java.util.*;
import java.util.stream.Collectors;
public class streams1 {
    public static void main(String[] args) {
        List<Integer> al =  Arrays.asList(1,2,11,4,5,6,7,8,9,10);
        int sum = al.stream()
                .filter(n->n%2!=0)
                .mapToInt(n->n*2)
                .sum();
            System.out.println(sum);
        // above line prints the sum of the odd numbers after multiplying with 2 so the
        // sum value is 60
        //explanation :- after 8 line stream contians the odd numbers[1,11,5,7,9]
        //after 9 line stream contains mapped of the odd multiply with 2 [2,22,10,14,18]
        //after the 10 line stram make the sumof the all the elements 2+22+10+14+18 = 
        List<Integer> l = al.stream()
        .filter(i -> i%2 != 0)
        .sorted()
        .collect(Collectors.toList());
        System.out.println(l);
        // above line prints the odd numbers in sorted order
        //explanation :- after 18 line stream contians the odd numbers[1,11,5,7,9]
        //after 19 line stream contains sorted odd numbers stream [1,5,7,9,11]
        //after the 20 line stream make the collection of  the all the elements in to the list 
        
    }

}
