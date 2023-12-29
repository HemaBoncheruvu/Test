public class left {
    public static int[] left1()
    {
        int[] a={1,0,0,4,5,6,0,0};
        int[] b=new int[a.length];
        int j=a.length-1;
        for(int i=a.length-1;i>=0;i--)
        {
         if(a[i]!=0)
         {
            b[j]=a[i];
            j--;
         }   

        }   

         for(int t=0;t<b.length;t++)
         {
            System.out.print(b[t]);
         }
         return b;
    
        }
    public static void main(String[] args) {
        left1();
    }
}

