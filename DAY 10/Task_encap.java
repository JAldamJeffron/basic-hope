class Locker {
	private int LockerId;
	private int item;
	private boolean isLocked=true;
	private int pin;
	public Locker(int LockerId,int pin) {
		this.LockerId=LockerId;
		this.pin=pin;
	}
	void storeItem(int item,int pin) {
		if (this.pin==pin && isLocked==false) {
			this.item=item;
		}
		else {
			lock();
			System.out.println("Invalid pin");
		}
	}
	int retrieveItem(int pin) {
		if(this.pin==pin && isLocked==false) {
			return item;
		}
		else{
			lock();
			return 0;
		}
	}
	void unlock(int pin) {
		if(this.pin==pin) isLocked=false;
		else lock();
	}
	void lock() {
		isLocked=true;
	}
	
	
	
	
}
public class Task_encap {
	public static void main(String[] args) {
		Locker l = new Locker(01,1234);
		l.storeItem(5, 1234);
		int item= l.retrieveItem(1234);
		System.out.println(item==0?"Invalid pin":item);
		l.unlock(1234);
		
	}
}