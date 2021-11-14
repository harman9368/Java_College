package p22;

public class Emp extends Person{
    int eid;
    int sal;
    public Emp(int eid, int sal, int age, String name)
    {
        super(age, name);
        this.eid= eid;
        this.sal= sal;

       // this.age= age;
       // this.name= name;
    }
}
