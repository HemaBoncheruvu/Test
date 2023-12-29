public class miss13 {
    public static void main(String[] args) {
        int[] a={1,0,2,0,0,7};
        int[] j=new int[a.length];
        int k=0;
        for(int i=0;i<a.length-1;i++){
            if (a[i]!=0)
            {
                j[k]=a[i];
                k++;
            
            }
        }
        System.out.println(k);
    }

    
}
