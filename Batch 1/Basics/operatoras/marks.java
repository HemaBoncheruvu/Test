public class marks {
    public static void main(String[] args) 
    {
        int tenth=95;
        int dip=81;
        int btech=82;
        System.out.println(tenth>=dip && dip<=btech);
        System.out.println(tenth>=dip && dip>=btech);
        System.out.println(dip>=tenth && tenth>=btech);
        System.out.println(btech>=tenth && btech==dip);
        System.out.println(tenth>=100 || tenth<=100 && tenth==100 ^ tenth >=65 );
        

        
    }
    
}
