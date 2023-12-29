class bank{
    double acc_bal;
    void deposit(int n)
    {
      System.out.println("deposited amount-"+n);
      acc_bal+=n;
    }
   
    
    void withdraw(int n)
    {
        System.out.println("withdraw amount:-"+n); 
        acc_bal-=n;
    }
    void total_balance(){
   double total=acc_bal;
    System.out.println("tatal bal :-"+total);
    }
}
class Mainclass1
{
  public static void main(String[] args) {
    bank b1=new bank();
    b1.acc_bal=10000;
    b1.deposit(5000);
    b1.withdraw(3000);
    b1.total_balance();
    System.out.println(b1.acc_bal);
  }
}