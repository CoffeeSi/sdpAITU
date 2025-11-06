package elements;
import interfaces.ISchoolElement;
import interfaces.ISchoolVisitor;

public class Student implements ISchoolElement {
    private String name;
    private float grade;

    public Student(String name, float grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() { return name; }
    public float getGrade() { return grade; }

    @Override
    public void accept(ISchoolVisitor visitor) {
        visitor.visitStudent(this);
    }
}
