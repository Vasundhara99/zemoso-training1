package vasundhara.assignment1.data;

public class PrintLocalAndGlobal {
    private int marks;
    private char grade;
    public void printGlobalVariables()
    {
        System.out.println(marks);
        System.out.println(grade);
    }
    public void printLocalVariables()
    {
        /*int a;
        int b;
        System.out.println(a);
        System.out.println(b);
        THE ABOVE LINES DOESN'T WORK BECAUSE LOCAL VARIABLES SHOULD BE INITIALISED
        WHEREAS THE INSTANCE VARIABLES "marks* AND "grade" NEED NOT BE INITIALISED BECAUSE THE JVM INITIALISES
        THE INSTANCE VARIABLES TO DEFAULT VALUES BASED ON THEIR TYPE
         */
    }
}
