class notification{
    void send(){
        System.out.println("notification sent");
    }
}
class emailnotification extends notification{
    void send(){
        System.out.println("email notification sent");
    }
}
class smsnotification extends notification{
    void send(){
        System.out.println("sms notification sent");
    }
}
public class notify{
    public static void main(String args[]){
        notification n=new emailnotification();
        n.send();
    }
}