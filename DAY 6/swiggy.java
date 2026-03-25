class user{
    String name;
    String phone;
    String location;

    user(String name, String phone, String location){
        this.name=name;
        this.phone=phone;
        this.location=location;
    }
}
class ride extends user{
    String vehicletype;
    ride(String name, String phone, String location, String vehicletype){
        super(name, phone, location);
        this.vehicletype=vehicletype;
    }
    void displayinfo(){
        System.out.println(name);
        System.out.println(phone);
        System.out.println(location);
        System.out.println(vehicletype);
    }
}

class food extends user{
    String favfood;
    food(String name, String phone, String location, String favfood){
        super(name, phone, location);
        this.favfood=favfood;
    }
    void displayinfo(){
        System.out.println(name);
        System.out.println(phone);
        System.out.println(location);
        System.out.println(favfood);
}
}

class parcel extends user{
    String item;
    parcel(String name, String phone, String location, String item){
        super(name, phone, location);
        this.item=item;
    }
    void displayinfo(){
        System.out.println(name);
        System.out.println(phone);
        System.out.println(location);
        System.out.println(item);
}
}

public class swiggy{
    public static void main(String[] args) {
        ride r=new ride("jeffrey", "1234567890", "chennai", "car");
        food f=new food("jeffrey", "1234567890", "chennai", "pizza");
        parcel p=new parcel("jeffrey", "1234567890", "chennai", "laptop");
        r.displayinfo();
        f.displayinfo();
        p.displayinfo();
}
}