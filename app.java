
import java.util.Scanner;

class user{
    String name;
    String phone;
    String address;

    user(){
        System.out.println("user");
    }
}
class food extends user
{
    String favfood;
    
    food()
    {
        System.out.println("food");
    }
}
class travel extends user
{
    String preflocation;

    travel()
    {
        System.out.println("travel");
    }
}

class app
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        user travel =new travel();
    }
}