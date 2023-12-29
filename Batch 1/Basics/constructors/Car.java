class Car{
    String Brand_name;
    String Engine_type;
    String Fuel_type;
    int Seating_capacity;
    String Model;
    Car(String Brand_name,String Engine_type,String Fuel_type,int Seating_capacity,String Model){
        Brand_name=Brand_name;
        Engine_type=Engine_type;
        Fuel_type=Fuel_type;
        Seating_capacity=Seating_capacity;
        Model=Model;
    }
       void info()   
         {
            System.out.println("Brand name:-"+Brand_name+"Engine type:-"+Engine_type+" Fuel type:-"+Fuel_type+" Seatung capacity:-"+Seating_capacity+" Model:-"+Model);

         }


    
   
}