import java.util.*;
class Collectiont{
    public static void main(String[] args) {
        // Object[] arr = new Object[4];
        // arr[0] = 7;
        // arr[1] = "gg";
        // for(Object a : arr)
        // {
        //     System.out.print(a+" ");
        // }

        ArrayList<Integer> l = new ArrayList<>();
        l.add(3);
        l.add(3);
        l.add(3);
        // l.add("rahul");
        // l.add(4.0);
        // Iterator i = l.iterator();
        // while(i.hasNext())
        // System.out.println(i.next());
            for(Integer i:l)
            {
                System.out.println(i);
            }
    }
}