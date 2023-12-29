import java.util.Scanner;

public class ass1 {
    public static void main(String[] args)
    {
        Scanner sc1=new Scanner(System.in);
           System.out.println("Enter a char");
        char chr=sc1.next().charAt(0);
        int h=chr;
        upper(h);
        

        }
        public static void upper(int  h){
            if(h>=65 && h<=90){
                System.out.println("print upper case");

            }
            if(h>=97 && h<=122){
                System.out.println("print lower case");
        }
    if(h>=42 && h<=50){
        System.out.println("num");
    }
    else{
        System.out.println("default");
    }
}
}
