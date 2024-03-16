// import java.util.*;
// class A
// {
//     public void show()
//     {
//         System.out.println("show in a");
//     }
// }
// class B extends A{
//     public void show()
//     {
//         System.out.println("show in new class");
//     }
// }
class Anonymous_class
{
    public static void main(String[] args) {
        // A obj = new B();
        // obj.show();
        A obj = new A(){
            public void show()
            {
                System.out.println("show in new");
            }
        };
        obj.show();
    }
}