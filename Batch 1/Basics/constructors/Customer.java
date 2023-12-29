public class Customer {
    String Id;
    String Name;
    long Adhar;
    String Product;
    Customer(String p1,String p2,long p3,String p4){
        Id=p1;
        Name=p2;
        Adhar=p3;
        Product=p4;
    }
    void Details(){
        System.out.println("Id of customour:-"+Id+"Name of the cust:-"+Name+"Adhar no"+Adhar+" Name of product"+Product);
    }
}
