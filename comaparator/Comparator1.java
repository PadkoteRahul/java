    import java.util.*;

    public class Comparator1{
        public static void main(String[] args) {

            Comparator<Integer> cm = new Comparator<Integer>()
            {
                public int compare(Integer a, Integer b)
                {

                    if(a%10 > b%10)
                        return 1;

                    else  if(a%10 < b%10) return -1;

                    else return Integer.compare(a, b);
                    // int k=a%10,l=b%10;
                    // if(a!=b)
                    // return Integer (a%10).compareTo(b%10);
                    // return a.compareTo(b);
                }
            };

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size : ");
            int n = sc.nextInt();
            ArrayList<Integer> al = new ArrayList<>(n);
            System.out.println("Enter numbers to sort ");
            for(int i=0; i<n; i++)
            {
                int k = sc.nextInt();
                al.add(k);
            }
            // Collections.sort(al);
            
            // System.out.println("Elelments after sorting the element based on the value: "+al);
            
            // Collections.sort(al,cm);
            Collections.sort(al,(i,j) -> ((Integer)(i%10)).compareTo((Integer)(j%10)) );
            System.out.println("Elelments after sorting the element based on the lastdigit: "+al);
        }    
    }