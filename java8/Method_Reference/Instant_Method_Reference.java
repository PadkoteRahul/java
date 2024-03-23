import java.util.*;
interface Sayable
{
    void say();
}
public class Instant_Method_Reference {
    public void saySomething()
    {
        System.out.println("hello this is from the Instant_Method_Reference...");
    }
    public static void main(String[] args)
    {
        // Sayable s = Instant_Method_Reference :: saySomthing;
        Instant_Method_Reference s = new Instant_Method_Reference();
        Sayable sayable = s::saySomething;
        //  :: saySomething;
        sayable.say();
    }
}
