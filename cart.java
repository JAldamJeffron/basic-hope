import java.util.Scanner;

class product {
    int id;
    String name;
    double price;
    int quantity;

product(int id,String name,double price,int quantity){
    this.id=id;
    this.name=name;
    this.price=price;
    this.quantity=quantity;
}
    double getTotalPrice() {
    return price * quantity;
}
void display()
{
    System.out.println("product id: "+id);
    System.out.println("product name: "+name);
    System.out.println("product price: "+price);
    System.out.println("product quantity: "+quantity);
}
}

public class cart
{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    product p1=new product(1,"aldam",50000.0,6);
    product p2=new product(2,"jeo",1000.0,10);
    product p3=new product(3,"jeffy",500.0,8);
    product[] Cart={p1,p2,p3};
    double grand_total=0.0;
    for(product p:Cart){
        p.display();
        grand_total+=p.getTotalPrice();
    }
    System.out.println("Grand total price"+ grand_total);
    }
}
