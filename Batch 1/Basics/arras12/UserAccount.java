public class UserAccount {
    String username;
    String email;
    String password;
    long phonnum;
    UserAccount(String p1,String p2,String p3)
    {
        username=p1;
        email=p2;
        password=p3;
    }
    UserAccount(String p1,long p2,String p3){
        username=p1;
        phonnum=p2;
        password=p3;

    }
    void info(){
        System.out.println("username:-"+username+ "user email"+email+"password"+password+"phone num"+phonnum);
    }
    
}
