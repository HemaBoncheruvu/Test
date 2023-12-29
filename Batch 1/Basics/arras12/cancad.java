import java.util.Scanner;
public class cancad {
    public static int[] merge(int[] num1, int[] num2,int[] num3){
                int[] res=new int[num1.length+num2.length+num3.length];
                    int x=0;
                    for(int i=0;i<num1.length;i++){
                        res[x]=num1[i];
                        x++;
                    }
                    for(int j=0;j<num2.length;j++){
                        res[x]=num2[j];
                        x++;
                    }
                     
                    for(int k=0;k<num3.length;k++){
                        res[x]=num3[k];
                        x++;
                    }
                    return res;

                }
                public static void main(String[] args) {
                    Scanner sc1=new Scanner(System.in);
                    System.out.println("enter size");
                    int n=sc1.nextInt();
                    int[] num1=new int[n];
                    System.out.println("enter second array");
                    int n1=sc1.nextInt();
                    int[] num2=new int[n];
                    System.out.println("enter 3rd array");
                    int n2=sc1.nextInt();
                    int[] num3=new int[n];
                    int n3=sc1.nextInt();
                    System.out.println("emter first array");
                   merge(num1,num2,num3);
                    
                }
            }
    

