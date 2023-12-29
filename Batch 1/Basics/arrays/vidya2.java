class vidya2
{
    public static void cub()
    {
        int x=10;
        int y=20;
        System.out.println(x*x*x);
        System.out.println(y*y*y);
    }
    public static void square()
    {
        int x=10;
        System.out.println(x*x);
    }
    public static void triangle()
    {
        float b=10.00f;
        float h=20.00f;
       float area=(1/2*b*h);
    }
    public static void main(String[] args)
    {
      System.out.println("vidya");
        cub();
        square();
        triangle();
    }
}