package vasundhara.assignment1.main;
import vasundhara.assignment1.data.PrintLocalAndGlobal;
import vasundhara.assignment1.singleton.StaticAndNonStatic;

public class MainClass {
    public static void main(String args[])
    {
        PrintLocalAndGlobal p=new PrintLocalAndGlobal();
        p.printGlobalVariables();
        p.printLocalVariables();
        StaticAndNonStatic s=StaticAndNonStatic.getInstance("vasundhara");
        s.print();
    }
}
