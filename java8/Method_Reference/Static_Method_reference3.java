//we can use the predifined functional interface to refer methods. now we are using 
//BiFunction interface and using it's apply() method

// https://www.geeksforgeeks.org/java-bifunction-interface-methods-apply-and-addthen/

// Interface BiFunction<T,U,R>
// Type Parameters:
// T - the type of the first argument to the function
// U - the type of the second argument to the function
// R - the type of the result of the function

// This is a functional interface and can therefore be used as the assignment target for a lambda expression or method reference.

import java.util.function.BiFunction;
public class Static_Method_reference3 {
    public static int add(int a, int b)
    {
        return a+b;
    }
    public static float add(int a, float b)
    {  
        return a+b;  
    }  
    public static float add(float a, float b)
    {  
        return a+b;  
    }  
    public static void main(String[] args)
    {
        BiFunction<Integer, Integer, Integer> add_it = Static_Method_reference3::add;
        BiFunction<Integer, Float, Float> add_it2 = Static_Method_reference3::add;
        BiFunction<Float, Float, Float> add_it3 = Static_Method_reference3::add;
        System.out.println(add_it.apply(2,3));
        System.out.println(add_it2.apply(2,4.0f));
        System.out.println(add_it3.apply(3.0f,3.0f));
    }
}
