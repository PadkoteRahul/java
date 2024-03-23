import java.util.*;
// we have defined a functional interface and referring a static method to 
// it's functional method say().
interface Sayable{
    void say();
}
public class Static_Method_Reference1 {
    public static void Saysomething()
    {
        System.err.println("Hello this is the  type of static method reference calling");
    }
    public static void main(String[] arr)
    {
        //1 and 2 are the processing the static method calling in
        // with the concept of the method reference calling 
        Sayable sayable = Static_Method_Reference1 :: Saysomething;
        sayable.say();
    }
}

