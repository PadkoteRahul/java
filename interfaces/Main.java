import java.util.*;
interface A
{
    void show();
    void print();
}
interface X
{
    void run();
}
interface Y extends X
{

}
abstract class B implements A,X
{
    
    public void print()
    {
        System.out.println("print method");
    }
    public void run()
    {
        System.out.println("run method");
    }
    public void walk()
    {
        System.out.println("walking");
    }
}
class C extends B{
    public void show()
    {
        System.out.println("show method");
    }
}
class Main
{
    public static void main(String[] args)
    {
        A obj;
        obj = new C();
        obj.print();
        obj.show();
        X obj1;
        obj1 = new C();
        obj1.run();
        // obj.walk();
        // obj1.walk();
        C b1 = new C();
        b1.run();
        b1.print();
        b1.walk();
        b1.show();
    }
}