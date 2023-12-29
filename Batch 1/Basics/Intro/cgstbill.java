 class cgstbill 
 {
    public static void main(String[] args) 
    {
        double billamount=10000.0;
        double cgst, sgst, totalbill;
        cgst=sgst=(9.0/100.0)*billamount;
        totalbill=billamount+cgst+sgst;
        System.out.println("bill"+billamount);
        System.out.println("cgst amount "+cgst);
        System.out.println(sgst);
        System.out.println(totalbill);

    }
    
}
