// import java.util.*;

// //Java lambda expression example                
// interface inter
// {
//     void abstractfun(int x);

//     default void print()
//     {
//         System.out.println("default method");
//         print1();
//     }
//     static void print1()
//     {
//         System.out.println("hello this is static implemented method");
//     }
// }
// class Lambda
// {

//     public static void main(String[] args) {
//         // inter inte = (int x) -> System.out.println(2*x);
//         // inte.abstractfun(2);
//         // inte.print();
//         // inte.print1();
//         ArrayList<Integer> al = new ArrayList<>();
//         al.add(2);
//         al.add(3);
//         al.add(4);
//         //printing  all the array elements using lambda expression
//         al.forEach(n -> System.out.print(n+" "));
//         System.out.println();
//         //printing only even numbers using lambda expresssion
//         al.forEach(  n->
//         {
//             if(n%2 == 0)
//             System.out.print(n+" ");
//         });
//     }
// }

// 1. Lambda Expression with no argument passed to the function
// import java.util.*;
// interface Test
// {
//     void print();
// }
// class Lambda 
// {
//     static void func(Test t) {
//         t.print();
//     }
//     public static void main(String[] args) {
//         func(() -> System.out.println("Hello good morning, have a nice day"));
//     }
// }

//2.Lambda expresion with single parameter
// import java.util.*;
// interface Test2
// {
//     void print(int p);
// }
// class Lambda{
//     static void func(Test2 t2, int p)
//     {
//         t2.print(p);
//     }
//     public static void main(String[] args) {
//         func((p)->System.out.println(p), 10);
//     }

// }
// 3.Lambda Expresion with multiple parameters
// import java.util.*;
// class Lambda{

//     interface funcInter1
//     {
//         int operate(int a, int b);
//     }
//     interface funcInter2
//     {
//         void sayMessage(String msg);
//     }

//     private int operation(int a, int b, funcInter1 obj)
//     {
//         return obj.operate(a, b);
//     }

//     public static void main(String[] args) {
//         funcInter1 add = (a,b) -> a+b;

//         funcInter1 mul = (a,b) -> a*b;

//         Lambda lb = new Lambda();
//         System.out.println(lb.operation(2, 3, add));
//         System.out.println(lb.operation(2, 3, mul));
        
//         funcInter2 msg = message -> System.out.println("Hello " + message);

//         msg.sayMessage("Geek");
//     }
// }

//Different ways to iterate an object
import java.util.*;
class Lambda{
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Hello");
        al.add("mr.Rahul,");
        al.add("Have a good day");
        for( String s : al) System.out.print(s+" ");      //enhanced for loop
        System.out.println();
        
        al.forEach((e) -> System.out.print(e+" "));        //forEach of lambda expression
        System.out.println();

        Iterator<String> i = al.iterator();                //Using iteratorable interface
        while(i.hasNext())
        {
            System.out.print(i.next()+" ");
            // String ele = i.next();
            // System.out.print(ele+" ");
        }

    }
}