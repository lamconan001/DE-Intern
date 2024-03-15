import java.io.Serializable;

public class School implements Serializable {
    private String name;
    private String location;

    public School(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public void display() {
        System.out.println("School name: " + name + "\n" + "Location: " + location);
    }
}
