package HashSet;

public class Student {
    private String studentId;
    private String name;
    private String age;

    public Student(String studentId, String name, String age) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public boolean equals(Object object) {
        if (object instanceof Student){
            Student another = (Student) object;
            if (this.studentId.equals(another.studentId)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.studentId.hashCode();
    }
}
