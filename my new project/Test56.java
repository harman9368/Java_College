interface i1
{

}
interface i2 extends i1
{

}
interface i3 extends i1
        {

        }

class OverDemo
{
    public void m1(i1 obj1)
    {
        System.out.println("GLA");
    }
    public void m1(i2 obj1)
    {
        System.out.println("Hello");
    }
    public void m1(i3 obj1)
    {
       System.out.println("hello");
    }
}
public class Test56 {
    public static void main(String[] args) {
        new OverDemo().m1((i2) null);
        OverDemo obj5 = null;
    }

}
