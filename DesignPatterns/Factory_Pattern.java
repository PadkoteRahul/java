// The Factory Pattern is a creational design pattern that provides an interface for 
// creating objects in a superclass but allows subclasses to alter the type of objects that 
// will be created. This pattern promotes loose coupling by decoupling the instantiation of 
// objects from their usage.

//steps to create the factory pattern
// ========================================================
// 1.Define the Factory Interface (ButtonFactory)
// 2.Implement Concrete Factories:(WindowsButtonFactory, IosButtonFactory)
// 3.Define Product Interface:(Button)
// 4.Implement Concrete Products:(WindowsButton, IosButton)
//     Client Utilizes the Factory:

//     The client code interacts with the factory to create objects without knowing the 
//         specific class of the object being created.
// ==============================================
interface Button{
    void render();
    void Onclick();
}
class WindowsButton implements Button{
    public void render(){
        System.out.println("windows render button");
    }

    public void Onclick()
    {
        System.out.println("Windows onclick button");
    }
}

class IosButton implements Button{
    public void render(){
        System.out.println("IosButton render Button");
    }

    public void Onclick(){
        System.out.println("IosButton Onclick Button");
    }
}

interface ButtonFactory{
    Button CreateButton();
}

class WindowsButtonFactory implements ButtonFactory{
    public Button CreateButton(){
        return new WindowsButton();
    }
}

class IosButtonFactory implements ButtonFactory{
    public Button CreateButton(){
        return new IosButton();
    }
}

public class Factory_Pattern {
    public static void main(String[] args) {
        ButtonFactory BF1 = new WindowsButtonFactory();
        Button BT1 = BF1.CreateButton();
        BT1.render();

        ButtonFactory BF2 = new IosButtonFactory();
        Button BT2 = BF2.CreateButton();
        BT2.render();
    }


}
