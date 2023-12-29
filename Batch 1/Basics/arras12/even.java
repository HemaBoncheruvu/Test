import java.util.Scanner;
public class even {
    public static int[] evenlogic(int[] num){
        int[] res=new int[num.length];
        int m=0;
        for(int i=0;i<num.length;i++){
            if(num[i]%2==0){
                res[m]=num[i];
                m++;
            }
        }
        for(int j=0;j<num.length;j++){
            if(num[j]%2!=0){
               res[m]=num[j];
               m++; 
            }
        }
        

    }
    
}
