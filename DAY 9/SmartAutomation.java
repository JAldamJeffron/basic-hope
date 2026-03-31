class Automation {
    int time, temp;
    boolean Motion;
    public Automation(boolean Motion, int time, int temp) {
        this.Motion = Motion;
        this.time = time;
        this.temp = temp;
        conditions c = new conditions(new Automation(Motion, time, temp));
        c.motionlight();
        c.clocklight();
        c.tempAC();
    }
}
class conditions  {
    Automation a ;
    public conditions(Automation a){
        this.a = a;
    }
    void motionlight(){
    detection m = new MotionDetector(a.Motion);
    if(m.detects()){
        devices l= new light();
        l.turnon();
    }
    }
    void clocklight(){
    detection c= new clock(a.time);
    if(c.detects()){
        devices l = new light();
        l.turnon();
    }
    }
    void tempAC(){
    detection t = new temp(a.temp);
    if(t.detects()){
        devices ac= new AC();
        ac.turnon();
    }
    }

}
interface detection {
    boolean detects();
}
class MotionDetector implements detection {
    boolean motion;
    MotionDetector(boolean motion) {
        this.motion=motion;
    }
    @Override
    public boolean detects(){
        if(motion) return true;
        else return false;
    }
}
class clock implements detection{
    int hour;
    clock(int hour){
        this.hour=hour;
    }
    @Override
    public boolean detects(){
        if(hour==19) return true;
        return false;
    }
}
class temp implements  detection{
    int temp;
    temp(int temp){
        this.temp= temp;
    }
    @Override
    public boolean detects(){
        if(temp>30) return true;
        return false;
    }
}
abstract class devices {
    abstract void turnon();
}
class light extends devices{

    @Override
    public void turnon(){
        System.out.println("Light is turned on");
    }
}

class AC extends devices{

    @Override
    public void turnon(){
        System.out.println("AC is turned on");
    }
}
class SmartAutomation{
    public static void main(String[] args) {
        // Example usage
        new Automation(true, 19, 35);
        
    }

    
}