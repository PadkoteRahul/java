public class Final {
    public static void main(String[] args) {
        final String[] a = new String[3];
        String[] b = new String[3];
        String[] h = new String[3];
        // a=h;
        b=h;
        a[0] = "a";
        a[2] = "b";
        a[1] = "c";
        a[1] = "n";
        for(String c : a)
        {
            System.out.println(c);
        }
    }
}
