public class Student {
    String Student_name;
    String Degree;
    String Email;
    long Phonenum;
    Student(String p1,String p2,String p3){
        Student_name=p1;
        Degree=p2;
        Email=p3;
        
    }
    Student(String p1,String p2,long p4){
        Student_name=p1;
        Degree=p2; 
        Phonenum=p4;
    }
    void info(){
        System.out.println("Name of student:-"+Student_name+"degree -"+Degree+"Email no"+Email+"phone num"+Phonenum);
    }
    
}
