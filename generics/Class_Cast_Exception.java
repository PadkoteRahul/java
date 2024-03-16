import java.util.*;
class Class_Cast_Exception
{
    public static void printNames(List list)
    {
        for(int i=0; i<list.size(); i++)
        {
            String name = (String) list.get(i);
            System.out.println(name);
        }
    }
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add(new StringBuilder("hello"));
        printNames(list);
    }
}