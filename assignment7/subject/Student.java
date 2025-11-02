package subject;
import interfaces.IUser;

public class Student implements IUser {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() { return name; }

    @Override
    public void update(String message) {
        System.out.println(name + " (Student) got message: " + message);
    }

    @Override
    public String toString() {
        return "Student " + name;
    }
}
