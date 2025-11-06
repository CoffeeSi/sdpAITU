package elements;

import interfaces.ISchoolElement;
import interfaces.ISchoolVisitor;

public class Teacher implements ISchoolElement {
    private String name;
    private int yearsTeaching;

    public Teacher(String name, int yearsTeaching) {
        this.name = name;
        this.yearsTeaching = yearsTeaching;
    }

    public String getName() { return name; }
    public int getYearsTeaching() { return yearsTeaching; }
    
    @Override
    public void accept(ISchoolVisitor visitor) {
        visitor.visitTeacher(this);
    }
}
