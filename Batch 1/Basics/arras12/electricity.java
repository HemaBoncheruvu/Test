import java.util.Scanner;
public class electricity {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("enter a unit value");
        int unit=sc1.nextInt();
        int total=0;
        if(unit<100){
            System.out.println(total);
            
        }
        if(unit>100 && unit<=200 ){
            System.out.println((unit-100)*5);
        }
        else if(unit>200 && unit>=300) {
            System.out.println(500+(unit-200)*10);
        }

    }
       
    
    
}
