import java.util.*;
interface Messagable
{
    Message getMessage(String str);
}
class Message{

    Message(String st)
    {
        System.out.println(st);
    }
}
public class Reference_to_constructor {
    public static void main(String[] args) {
        Messagable ms = Message :: new;
        ms.getMessage("hello");
    }
}
