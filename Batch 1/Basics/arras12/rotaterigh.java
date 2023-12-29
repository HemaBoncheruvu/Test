import java.util.Scanner;
class rotaterigh{

    public static int[] rotate(int[] num){
       
        int first=num[0];
        for(int i=0;i<num.length-1;i++){
            {
                num[i]=num[i+1];
            }
        }
        
        num[num.length-1]=first;
        return num;
    }
   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size");
        int n=sc.nextInt();
        int[] num=new int[n];
        System.out.println("Enter elements");
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }
        System.out.println(num);
    }
}
