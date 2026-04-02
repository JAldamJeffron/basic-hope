
class OrderException extends Exception
{
	OrderException(String msg)
	{
		super(msg);
	}
}

class Product
{
	String name;
	int stock;
	double price;
	Product(String name,int stock,double price)
	{
		this.name=name;
		this.stock=stock;
		this.price=price;
	}
}
class User
{
	String name;
	String address;
	User(String name,String address)
	{
		this.name=name;
		this.address=address;
	}
}
class Order
{
	Product product;
	User user;
	int quantity;
	Order(Product product,User user,int quantity)
	{
		this.product=product;
		this.user=user;
		this.quantity=quantity;
	}
}

class OrderService
{
	void PlaceOrder(Order order) throws OrderException
	{
		if(order.product.stock<order.quantity)
		{
			throw new OrderException("Out Of Stock");
		}
		if(Math.random()<0.4)
		{
			throw new OrderException("Payment Failed");
		}
		if(Math.random()<0.2)
		{
			throw new OrderException("Order Process Failed");
		}
		order.product.stock-=order.quantity;
		System.out.println("Order Placed Successfully for User "+order.user.name+" Your "+order.product.name+" Will be Shipped to "+order.user.address+" Total Cost is "+order.product.price*order.quantity+" Remaining Stock Available Is "+order.product.stock);
		
	}
}

public class task8 {
	public static void main(String[] args)
	{
		Product product=new Product("Bag",100,1000);
		User user=new User("David","OMR");
		Order order=new Order(product,user,5);
		OrderService placeorder=new OrderService();
		try
		{
			placeorder.PlaceOrder(order);
		}
		catch(OrderException e)
		{
			System.out.println(e.getMessage());
		}
		
		
	}
}