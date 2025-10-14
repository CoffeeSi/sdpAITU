package decorator;

public class TeacherDecorator extends BaseDecorator {
    public TeacherDecorator(IPerson person) {
        super(person);
    }

    @Override
    public String getRoles() {
        return super.getRoles() + ", Teacher";
    }

    @Override
    public String getPermissions() {
        return super.getPermissions() + ", Grade Assignments, Manage tasks";
    }
}
