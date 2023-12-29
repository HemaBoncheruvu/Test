public class numbers {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        for(int i=a.length-1;i>0;i++){
            int[] res=new int[a.length];
            int j=a.length-1;
            res[j]=a[i];
            j++;

        }
        for(int t=0;t<res.length;t++){
            System.out.println(res[t]);
        }
        
    }
    
}
