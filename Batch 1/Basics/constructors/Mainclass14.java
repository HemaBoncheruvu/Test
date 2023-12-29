import java.util.Scanner;
public class Mainclass14 {
    public static void main(String[] args){
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter a id of cust");
        String c1=sc1.next();
        System.out.println("enter name of cust");
        String c2=sc1.next();
        System.out.println("entr adhar no");
        long c3=sc1.nextLong();
        System.out.println("ENTER PRODUCT NAME");
        String c4=sc1.next();
        Customer d1=new Customer(c1,c2,c3,c4);
        d1.Details();
    }
}
