package vasundhara.assignment2.task3;

public class objectsAndObjectReferences {
    objectsAndObjectReferences()
    {
        System.out.println("default constructor");
    }
    objectsAndObjectReferences(String name)
    {
        System.out.println(name);
    }
    public static void main(String[] args)
    {
        objectsAndObjectReferences obj[]=new objectsAndObjectReferences[5];
        /*THE ABOVE LINE DOESN'T CALL THE DEFAULT CONSTRUCTOR BECAUSE ONLY OBJECT REFERENCES ARE CREATED
        DEFAULT CONSTRUCTORS ARE CALLED WHEN OBJECTS ARE CREATED AS FOLLOWS
        */
        for(int i=0;i<5;i++)
        {
            obj[i]=new objectsAndObjectReferences("Ram");
        }
    }
}
