package p22;

class one
{
 public int num1=90;
}
class two extends one
{
    public int num1= 67;
    public void display()
    {
        System.out.println(num1);
        System.out.println(one.this.num1);
    }

    public static void main(String[] args) {
        two obj= new two();
        obj.display();
        System.out.println();
    }
}




public class Test34 {

    }

