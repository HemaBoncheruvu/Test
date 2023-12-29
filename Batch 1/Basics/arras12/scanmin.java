import java.util.Scanner;
public class scanmin {
    public static int[] max(int[] nums){
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
            
        }

          return max;
    }
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a size of array");
    int a=sc.nextInt();
    int[] num=new int[a];
    System.out.println("enter elements");
    for(int i=0;i<a;i++){
        nums[i]=sc.nextInt();

    }
    System.out.println(nums);
}

    }
    

