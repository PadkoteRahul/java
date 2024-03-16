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
