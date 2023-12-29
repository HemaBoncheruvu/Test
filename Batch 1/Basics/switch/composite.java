public class composite {
    public static void main(String[] args) {
        int n=5;
        int i;
        for( i=2; i <=n/2; i++){
            if(n%i==0){
                System.out.println(n+ " is a composite number");
                break;
            }
        }
             if( i==n/2+1){
                System.out.println(n+"is a prime number");
            }
        
    }
    
}
