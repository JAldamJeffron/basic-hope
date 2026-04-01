class BankAccount{
    private  double balance;
    public void setBalance(double balance){
        if (balance>0) this.balance=balance;
        else System.out.println("Invalid balance");
    }
    public double getBalance(){
        return balance;
    }
}
class Encapsulation{
    public static void main(String[] args){
        BankAccount b= new BankAccount();
        b.setBalance(1000);
        System.out.println("Balance: "+b.getBalance());
    }
}