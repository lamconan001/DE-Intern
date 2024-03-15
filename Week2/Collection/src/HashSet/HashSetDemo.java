package HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSetDemo {
    public static void main(String[] args) {
        Student student1 = new Student("123", "Lam", "20");
        Student student2 = new Student("456", "Phuoc", "21");
        Student student3 = new Student("123", "Lam", "20");
        Student student4 = new Student("789", "Binh", "24");
        HashSet<Student> studentHashSet = new HashSet<Student>();
        studentHashSet.add(student1);
        studentHashSet.add(student2);
        studentHashSet.add(student3);
        studentHashSet.add(student4);
        for(Student student : studentHashSet) {
            System.out.println(student.getStudentId() + " " + student.getName() + " " + student.getAge());
        }
        System.out.println("\n");
        List<Student> studentList = new ArrayList<Student>(studentHashSet);
        studentList.sort(new NameComparator());
        for (Student student : studentList) {
            System.out.println(student.getStudentId() + " " + student.getName() + " " + student.getAge());
        }
    }
}
