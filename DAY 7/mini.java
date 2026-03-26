class Character{
    String name;
    Character(String name){
        this.name=name;
    }
    public void attack(){
        System.out.println(name+"attack");
    }
}
class warrior extends Character{
    warrior(String name){
        super(name);
    }
    public void attack(){
        System.out.println(name+"warrior attack with sword");
    }
}
class archer extends Character{
    archer(String name){
        super(name);
    }
    public void attack(){
        System.out.println(name+"archer attack with arrow");
    }
}
class mage extends Character{
    mage(String name){
        super(name);
    }
    public void attack(){
        System.out.println(name+"mage attack with magic");
    }
}

public class mini {
    public static void main(String[] args){
        Character c1=new warrior("ALDAM");
        Character c2=new archer("JEFFY");
        Character c3=new mage("JEO");
        c1.attack();
        c2.attack();
        c3.attack();
    }
}
