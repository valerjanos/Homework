public class test3
{
    static boolean foo1()
    {
        System.out.print("foo1()");
        return true;
    }
    static boolean foo2()
    {
        System.out.print("foo2()");
        return false;
    }
    public static void main(String[] args)
    {
        boolean bool;
        bool = foo1()|foo2();
        System.out.print(" ");
        bool = foo2()&&foo1();
        System.out.print(" ");
        bool = foo2()||foo1();
        System.out.print(" ");
        bool = foo2()&&foo1();
    }
}