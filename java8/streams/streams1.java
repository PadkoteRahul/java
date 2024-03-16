import java.util.ArrayList;
import java.util.*;
import java.util.stream.Collectors;
public class streams1 {
    public static void main(String[] args) {
        List<Integer> al =  Arrays.asList(1,2,11,4,5,6,7,8,9,10);
        // int sum = al.stream()
        //         .filter(n->n%2==0)
        //         .mapToInt(n->n*2)
        //         .sum();
        //     System.out.println(sum);
        List<Integer> l = al.stream()
                        .filter(i -> i%2 != 0)
                        .sorted()
                        .collect(Collectors.toList());
        System.out.println(l);

    }

}
