import java.util.*;
import java.util.stream.Collectors;

//Both of the functions map() and flatMap are used for transformation and mapping 
// operations. map() function produces one output for one input value, whereas flatMap() 
// function produces an arbitrary no of values as output (ie zero or more than zero) for 
// each input value.
public class Map_and_flatMap {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Apple");
        al.add("Mango");
        al.add("Pineapple");
        al.add("Banana");
        al.add("Kiwi");
        // map() can be used where we have to map the elements of a particular collection 
        // to a certain function, and then we need to return the stream which contains the 
        // updated results.
        List<Integer> list = al.stream()
                .map(s -> s.length())
                .collect(Collectors.toList());
        System.out.println(list);

        // ====================================================================
        // ====================================================================


        List<List<Integer>> all = new ArrayList<>();
        all.add(Arrays.asList(1,2));
        all.add(Arrays.asList(3,4));
        all.add(Arrays.asList(5,6));
        all.add(Arrays.asList(7,8));

        // flatMap() can be used where we have to flatten or transform out the string, 
        // as we cannot flatten our string using map().
        
        List<Integer> ar = all.stream()
                            .flatMap(lst -> lst.stream())
                            .collect(Collectors.toList());
        System.out.println(ar);



    }
}
