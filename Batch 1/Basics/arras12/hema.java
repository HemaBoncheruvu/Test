class hema
{
   
public static String even(int n)
{
    int rem=n%10;
    if(rem%2==0){
        return "Yes";
    }
    return "No";
}
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
         int n=sc1.nextInt();
        System.out.println(even(n));
    }
}
        
    
