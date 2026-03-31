class Battery{
    void powersupply(){
        System.out.println("still have 40% power");
    }
    }
class Remote{
    Battery miniBattery = new Battery(); 
    void changechannel(){
        miniBattery.powersupply();
        System.out.println("channel supply");
    }
    void changevolume(){
        System.out.println("Change volume");
    }
}

class TV{
    Remote tvremote;
    TV(Remote tvremote)    {
        this.tvremote=tvremote;
    }
    void inc(){
        tvremote.changevolume();
    }
}
class Relationship{
    public static void main(String[] args) {
       Remote r = new Remote();
       TV sony = new TV(r);
       sony.inc();
    }
}