import java.util.*;

public class Cmp{
    public static void main(String[] args) {

        // Comparator<Integer> cm = new Comparator<Integer>()
        // {
        //     public int compare(Integer a, Integer b)
        //     {
        //         if(a%10 > b%10)
        //             return 1;
                
        //         else if(a%10 < b%10) return -1;

        //         else return Integer.compare(a, b);
        //     }
        // };

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int n = sc.nextInt();
        ArrayList<Integer> al = new ArrayList<>(n);
        HashMap<Integer,Integer> mp = new HashMap<Integer,Integer>();
        System.out.println("Enter numbers to sort ");
        for(int i=0; i<n; i++)
        {
            int k = sc.nextInt();
            al.add(k);
            mp.put(k,mp.getOrDefault(k,0)+1);
        }
        
        
        // Collections.sort(al);

        // System.out.println("Elelments after sorting the element based on the value: "+al);

        // Collections.sort(mp, new Comparator<Map.Entry<Integer,Integer>>()
        // {
        //     public int compare(Map.Entry<Integer,Integer> a, Map.Entry<Integer,Integer> b)
        //     {
        //         // if(a.getValue() > b.getValue())
        //         //     return 1;
                
        //         // else return -1;
        //         return Integer.compare(a.getValue(), b.getValue());
        //     }
        // });
        System.out.println("Elelments after sorting the element based on the lastdigit: "+mp);
        List<Map.Entry<Integer, Integer>> l = new ArrayList<>(mp.entrySet());
        // // l.forEach(m->System.out.println(m.getKey()+" "+m.getValue()));
        l.sort(new comp());
        System.out.println("Elelments after sorting the element based on the lastdigit: "+l);
    }    
}
class comp implements Comparator<Map.Entry<Integer, Integer>>
{
    @Override
    public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2)
    {
        // return Integer.compare(o2.getValue(), o1.getValue()); //descending order of the values(frequencies)
        return Integer.compare(o1.getValue(), o2.getValue()); //ascending order of the values(frequencies)
    }
}