// Let's consider a scenario where you are building a notification system for a messaging application, and you 
// want to create a flexible and reusable system to send notifications of different types (e.g., text messages, 
// emails, and push notifications) to users. We can use generics to achieve this.

interface Notification<T> {
    void SendNotification(T content);
}

class TextMessage {
    private String msg;

    public TextMessage(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return msg;
    }
}

class Emails {
    private String sub;
    private String body;

    public Emails(String sub, String body) {
        this.sub = sub;
        this.body = body;
    }

    @Override
    public String toString() {
        return sub + " : " + body;
    }
}

class PushNotification {
    private String title;
    private String msg;

    public PushNotification(String title, String msg) {
        this.title = title;
        this.msg = msg;
    }

    @Override
    public String toString() {
        return title + " : " + msg;
    }
}

class messagingAppNotification <T> implements Notification<T>{
    @Override
    public void SendNotification(T msg) {
        System.out.println("sending Notification :" + msg);
    }
}

class Generics_Interface_Example {
    public static void main(String[] args) {
        Notification<TextMessage> textMSG = new messagingAppNotification<>();
        Notification<Emails> Emails = new messagingAppNotification<>();
        Notification<PushNotification> pushNt = new messagingAppNotification<>();

        textMSG.SendNotification(new TextMessage("hello"));
        textMSG.SendNotification(new TextMessage("hell"));
        Emails.SendNotification(new Emails("about docs ", "hello this is programmer"));
        pushNt.SendNotification(new PushNotification("this is from boot", "hii buddy"));
    }
}
