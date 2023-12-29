import java.util.Scanner;
class Mainclass10 {
    public static void main(String[] args) {
        Scanner ua1=new Scanner(System.in);

        System.out.println("Enter your type: ");
        int type=ua1.nextInt();
        if(type==1){
         System.out.println("Enter user name:-");
        String s1=ua1 .next();
        System.out.println("Enter email:-");
        String s2=ua1.next();
     System.out.println("Passwod");
        String s4=ua1.next();

 UserAccount u1=new UserAccount(s1,s2,s4);
        u1.info();
        }
        else{
        
        System.out.println("Enter user name:-");
        String s1=ua1 .next();
        System.out.println("Enter phoneno:-");
        long s2=ua1.nextLong();
        System.out.println("Passwod");
        String s4=ua1.next();
        
        
        
        
         UserAccount u2=new UserAccount(s1,s2,s4);
        u2.info();
        }
        
    }
    
}
