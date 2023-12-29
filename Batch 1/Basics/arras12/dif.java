public class dif {
    public static void main(String[] args) {
        
    int[] nums={1,10,5,6,8};
    int max=nums[0];
    int min=nums[0];
    for(int i=0;i<=nums.length-1;i++)
    {
      if(nums[i]>max){
        max=nums[i];
      }
      if(nums[i]<min){
        min=nums[i];
      }
       
    }
   System.out.println(min);
   System.out.println(max); 
}
}
