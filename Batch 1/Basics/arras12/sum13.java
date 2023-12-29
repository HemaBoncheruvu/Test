public class sum13 {
    public static void main(String[] args) {
        int[] nums={1,2,3,13,4,5,13,13,6,13};
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=13){
                sum=sum+nums[i];
            }
            else{
                i++;
            }
        }
        System.out.println(sum);
}
    }
    

