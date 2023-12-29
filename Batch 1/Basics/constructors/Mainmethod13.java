import java.util.Scanner;
public class Mainmethod13 {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter a brand");
        String s1=sc1.next();
        System.out.println("engine type");
        String s2=sc1.next();
        System.out.println("enter fuel type");
        String s3=sc1.next("enter seting capacity");
        int s4=sc1.nextInt();
        System.out.println("enter model");
      String s5=sc1.next();
      Car d1=new Car(s1,s2,s3,s4,s5);
      d1.info();
    }
}
