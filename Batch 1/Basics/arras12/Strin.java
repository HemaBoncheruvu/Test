public class Strin {
    
    public static void main(String[] args) {
        String a="hema";
        String b="eem6";
        boolean s=false;
        if(a.length()==b.length()){
            for(int i=0;i<a.length();i++){
                if(a.charAt(i)==b.charAt(i)){

                    s=true;
                }
                else{
                    s=false;
                }
               
    }
   
}
System.out.println(s);
    }
}