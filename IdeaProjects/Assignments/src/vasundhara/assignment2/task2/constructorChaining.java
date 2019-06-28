package vasundhara.assignment2.task2;

public class constructorChaining {
    constructorChaining()
    {
        System.out.println("Constructor with zeros parameter");
    }
    constructorChaining(int x)
    {
        this();
        System.out.println("Constructor with one parameter");
    }
    public static void main(String args[])
    {
        constructorChaining c=new constructorChaining(5);
    }
}
