import javax.xml.namespace.QName;

public class Student extends Person {

    private School school;

    public Student(String name, int age, School school) {
        super(name, age);
        this.school = school;
    }
     public void display() {
        System.out.println("Student name: " + super.getName() + "\nAge: " + super.getAge());
        school.display();
     }

}
