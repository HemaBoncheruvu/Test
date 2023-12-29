public class account {
    final int acc_num;
    double accbal;
    String custname;
    private static int randnum=100001;
    
    public account(int acc_num, double accbal, String custname) {
        this.acc_num = acc_num;
        this.accbal = accbal;
        this.custname = custname;
    }

    void info(){
        System.out.println("account num:-"+acc_num+ "accbal:-"+accbal+"random num:-"+randnum);
    }
    
    }

    
    

