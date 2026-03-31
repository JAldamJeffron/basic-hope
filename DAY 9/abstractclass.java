abstract class Switch{
    abstract void turnon();
    abstract void turnoff();
    void info(){
        System.out.println("info");
    }
    }
class light extends Switch{
    @Override
    void turnon(){
        System.out.println("light is on");
    }
    @Override
    void turnoff(){
        System.out.println("light is off");
    }
}
interface wifi{
    void change();
}
interface control{
    void change();
    void inc();
}
class remote implements wifi,control{
    @Override
    public void change(){ // as change is defined in both wifi and control, change will have only one storage so it will get created as per the object is created
        System.out.println("Change the channel");
    }
    @Override
    public void inc(){
        System.out.println("inc volume");
    }
}
    public class abstractclass{
    public static void main(String[] args) {
        Switch s = new light(); // always create a abstract class with its child class because there is no method in parent class
        s.turnon();
        s.turnoff();
        s.info();
        wifi r= new remote(); //  parent-> child
        control c = new remote();
        r.change();
        c.inc();
    }
}