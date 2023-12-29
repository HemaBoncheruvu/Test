public class many {
    public static int[] sort(int[] num)
    
    {
        for(int i=0;i<num.length-1;i++)
    {
        for(int j=i+1; j<num.length-1;j++)
        {
            if(num[i]>num[j])
            num[i]=num[i]+num[j];
            num[i]=num[i]-num[j];
            num[i]=num[i]-num[j];


        }
    }
    System.out.println(num[i]+"");
    }
    return num;
}

