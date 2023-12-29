public class right {
    public static void main(String[] args) 
    {
    int[] num={1,0,2,0,0,7};
    int[] res=new int[num.length];
    int j=0;
    for(int i=0;i<=num.length-1;i++)
    {
        if(num[i]!=0)
        {
            res[j]=num[i];
            j++;
            
        }
        
    }
    for(int k=0;k<=res.length-1;k++)
    {
        System.out.println(res[k]);
    }
    //System.out.print(res[j]);

    }
    
}
