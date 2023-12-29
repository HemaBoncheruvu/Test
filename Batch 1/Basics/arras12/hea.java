class hea
{
    public static void main(String[] args)
    {
        int[] v1={1,2,3,4,5};
        int[] v2={6,7,8};
          int[] res=v1;
          int[] res2=v2;
       
        for(int i=0;i<5;i++)
        {
            System.out.println(v1[i]);
        }
        
        for(int j=0;j<=3; j++) 
        {
            System.out.println(v2[j]);
        }
        System.out.println(res+res2);

    }
}