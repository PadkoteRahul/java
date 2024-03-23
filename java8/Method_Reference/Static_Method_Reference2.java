//we are using predifined functiona Interface Runnable method to refer static method

import java.util.*;

public class Static_Method_Reference2 {
    public static void MyThread()
    {
        System.err.println("Thread is Running....");
    }
    public static void main(String[] args)
    {
        Thread t = new Thread(Static_Method_Reference2 :: MyThread);
        t.start();
    }
}
