class pen{
    String brand;
    String color;
    String type;
    void write(){
        System.out.println("write something with color"+color);
 }
 class Mainclass
 {
    public static void main(String[] args){
        pen p1=new pen();
        p1.brand="elcos";
        p1.color="pink";
        p1.type="light";
        p1.write();
        System.out.println(p1.brand+"color of pen"+p1.color+"type of pen"+p1.type);
    }

 }
}
    

