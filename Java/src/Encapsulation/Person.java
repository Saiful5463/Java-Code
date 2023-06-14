
package Encapsulation;

public class Person {
    protected String name = "Saiful";
    protected int age = 22;
}

class Student extends Person
{
    private int id = 5463;
    private double cgpa = 3.50;

    public void display ()
    {
        System.out.println("Name " + name);
        System.out.println("Age " + age);
        System.out.println("Id " + id);
        System.out.println("CGPA" + cgpa);
    }

    public static void main(String[] args) {
        Student st = new Student();
        st.display();
    }

}
