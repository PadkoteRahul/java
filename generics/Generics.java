// import java.util.*;
// class Generics
// {
//     public static void printNames(List list)
//     {
//         for(int i=0; i<list.size(); i++)
//         {
//             String name = (String) list.get(0);
//             System.out.println(name);
//         }
//     }
//     public static void main(String[] args) {
//         List names = new ArrayList<>();
//         names.add(new StringBuilder("Hello"));   
//         //java.lang.ClassCastException: class java.lang.StringBuilder cannot be cast to class java.lang.String
//         printNames(names);
//     }
// }
// import java.util.*;
// class Generics
// {
//     public static void printNames(List<String> list)
//     {
//         for(int i=0; i<list.size(); i++)
//         {
//             String name = (String) list.get(i);
//             System.out.println(name);
//         }
//     }
//     public static void main(String[] args) {
//         List<String> names = new ArrayList<>();
//         names.add(new StringBuilder("Hello"));   
//         incompatible types: StringBuilder cannot be converted to String
//         names.add(new StringBuilder("Hello"));
//         printNames(names);
//     }
// }
// class Generics{
//     public static <T> void printArray(T[] array) {
//         for (T element : array) {
//             System.out.print(element + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         Integer[] intArray = { 1, 2, 3, 4, 5 };
//         String[] stringArray = { "Hello", "World" };

//         System.out.print("Integer array: ");
//         printArray(intArray);

//         System.out.print("String array: ");
//         printArray(stringArray);
//     }
// }

// class Container<T>{
//     T value;
//     public void show()
//     {
//         System.out.println(value.getClass().getName());
//     }
// }
// class Generics{
//     public static void main(String[] args) {
//         Container<Double> a = new Container<>();
//         a.value = 50.0;
//         a.show();
//     }
// }

// import java.util.*;
// class Box<T>
// {
//     private T cont;
//     public Box(T cont)
//     {
//         this.cont = cont;
//     }
//     public T getContent()
//     {
//         return this.cont;
//     }
//     public void setContent(T cont)
//     {
//         this.cont = cont;
//     }
// }

// class Generics
// {
//     public static void main(String[] args) {
//         Box<Integer> b = new Box<>(70);
//         System.out.println(b.getContent());
//         b.setContent(30);
//         b.setContent(20);
//         System.out.println(b.getContent());
//     }
// }