package ClassMethod3;

public class StudentDriver
{
    public static void main (String[] arg)
    {
        Student Senior0001 = new Student();
        Student Senior0002 = new Student("joe", "senior", 4.0, 4.0, 3.5, 4.0, 4.0);
        
        System.out.println(Senior0001);
        Senior0002.setGPA(4.0, 4.0, 4.0, 4.0, 4.0);
        Senior0002.calcGPA();
        System.out.println(Senior0002);
        
    }
}