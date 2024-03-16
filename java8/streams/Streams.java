import java.util.Arrays;
import java.util.*;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        // Stream<Integer> s1 = l.stream();
        // Stream<Integer> s2 = s1.filter(n->n%2 != 0);
        // Stream<Integer> s3 = s2.map(n->n*2);
        // // s3.forEach(i->System.out.println(i));
        // int result = s3.reduce(0,(c,e)->c+e);


        // Stream<Integer> s1  = l.stream()
        //             .filter(n -> n%2 != 0)
        //             .map(n->n*2);
        // // s1.forEach(n->System.out.println(n));
        // int result = s1.reduce(0, (c,e)->c+e);


        int result = l.stream()
                    .filter(n -> n%2 != 0)
                    .map(n->n*2)
                    .reduce(0, (c,e)->c+e);

        System.out.println(result);
    }
}
