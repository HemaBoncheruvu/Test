class Demo6
{
    int p=10;
    static int x=200;
    void disp()
    {
        System.out.println("running dip() method");
    }
    static void test()
    {
        System.out.println("running test() method");
    }

}
class mainclass3
{
    public static void main(String[] args)
    {
        System.out.println("main method started");
        Demo6.x=20;
        System.out.println("value of x is"+Demo6.x);
        Demo6.test();
        System.out.println("value of p is"+new Demo6().p);
        new Demo6().disp();
        System.out.println("main method started");
    }
}