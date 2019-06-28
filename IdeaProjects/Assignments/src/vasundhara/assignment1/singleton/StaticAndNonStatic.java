package vasundhara.assignment1.singleton;

public class StaticAndNonStatic {
    String name;
    private static StaticAndNonStatic instance=new StaticAndNonStatic();
    public static StaticAndNonStatic getInstance(String name)
    {
        /*this.name=name;
        THE ABOVE LINE DOESN'T WORK BECAUSE STATIC METHODS CAN ACCESS ONLY STATIC METHODS AND STATIC VARIABLES
        AS THE VARIABLE "NAME" IS NOT STATIC,IT CANNOT BE ACCESSED FROM "StaticAndNonStatic" METHOD WHICH IS STATIC
        */
        return instance;
    }
    public void print()
    {
        System.out.println(name);
        /*
        THE ABOVE LINE PRINTS NULL BECAUSE THE INSTANCE VARIABLE "name" IS NOT INITIALISED.
        JVM INITIALISES THE STRING INSTANCE VARIABLE TO "null"
         */
    }
}
