import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ForEach {
    public static void main(String[] args) {
       List<Integer> al = Arrays.asList(1,2,3,4,3,2,1);
        Consumer<Integer> pd = new Consumer<Integer>(){
            public void accept(Integer i)
            {
                System.out.println(i);
            }
        };
        al.forEach(pd);
        al.for 
    }
}
