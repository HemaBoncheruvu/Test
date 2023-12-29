import java.util.Scanner;
public class Mainclass16 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
    
        System.out.println("Enter type");
        int type=sc.nextInt();
        if(type==1){
            System.out.println("enter name");
            String n1=sc.next();
            System.out.println("enter degree");
            String n2=sc.next();
            System.out.println("enter email");
            String n3=sc.next();
            Student k=new Student(n1,n2,n3);
            k.info();
        }
        else{
            System.out.println("enter name");
            String n1=sc.next();
             System.out.println("enter degree");
            String n2=sc.next();
            System.out.println("enter phonr num");
            long n4=sc.nextLong();
            Student f=new Student(n1,n2,n4);
            f.info();
        }
    }
    
}
