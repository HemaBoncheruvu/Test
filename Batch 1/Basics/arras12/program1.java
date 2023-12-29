class program1
{
    public  static void shift(int[] num)
    {
           
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
            
    }
    
}
class program2
{
    public static void main(String[] args){
    
    shift({ 1,0,2,0,0,7}); 
    }
}
