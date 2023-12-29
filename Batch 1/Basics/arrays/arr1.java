import java.util.Scanner;
class arr1{
    public static void main(String[] args) {
        Scanner ma=new Scanner(System.in);
        System.out.println("enter employee sal");
        double salary=ma.nextDouble();
        if(salary>1 && salary>=500000){
        System.out.println("no tax");
        }
        else if(salary>500000 && salary<=1000000){
            double taxamt=(salary*10)/100;
            System.out.println("tax amount is = "+taxamt);
        }
        else if(salary>1000000 && salary<=2000000){
            double taxamt=(salary*20)/100;
            System.out.println("tax amount is = "+taxamt);

    }
    else if(salary>2000000 ){
            double taxamt=(salary*30)/100;
            System.out.println("tax amount is = "+taxamt);
    }

    
    
}
}