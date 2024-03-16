// // // //give me an real life example scenario where can i use generics// // //

// Sure! Here's a real-life example scenario where you can use generics:

// Online Shopping Cart with Generic Items:

// Imagine you are developing an online shopping cart system where customers can add various types of items to their carts, such as electronics, clothing, and books. You want to create a flexible and reusable shopping cart class using generics.
import java.util.*;
class Electronics
{
    private String name;
    private int price;
    public Electronics(String name, int price)
    {
        this.name = name;
        this.price = price;
    }
    public String toString()
    {
        return "name :"+name+" ,price :"+price;
    }
}

class Cloths
{
    private String type;
    private float size;
    public Cloths(String type, float size)
    {
        this.type = type;
        this.size = size;
        
    }
    public String toString()
    {
        return "Type :"+type+" ,Size :"+size;
    }
}

class Book{
    private String name;
    private String author;
    public Book(String name, String author)
    {
        this.name = name;
        this.author = author;
    }
    public String toString()
    {
        return "Name :"+name+" ,author :"+author;
    }
}

class Shopping<T>{
    public List<T> items;
    public Shopping()
    {
        this.items = new ArrayList<>();
    }
    public void addItems(T item)
    {
        items.add(item);
    }
    public List<T> getitems()
    {
        return items;
    }
}

class Generics_Shopping_Mall_Example{
    public static void main(String[] args) {
        Shopping<Electronics> electors = new Shopping<>();
        electors.addItems(new Electronics("bulb", 40));
        electors.addItems(new Electronics("plug", 50));
        Iterator <Electronics> i = electors.getitems().iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
        Shopping<Cloths> cloths = new Shopping<>();
        cloths.addItems(new Cloths("T-shirt", 32));
        cloths.addItems(new Cloths("shorts", 30));
        Iterator<Cloths> j = cloths.getitems().iterator();
        while(j.hasNext())
        {
            System.out.println(j.next());
        }
        Shopping<Book> book = new Shopping<>();
        book.addItems(new Book("inside chanakya's mind", "radhakrishnan pillai"));
        book.addItems(new Book("you can win", "shiv khera"));
        Iterator<Book> k = book.getitems().iterator();
        while(k.hasNext())
        {
            System.out.println(k.next());
        }
    }
}