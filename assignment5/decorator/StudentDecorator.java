package decorator;

public class StudentDecorator extends BaseDecorator {
    public StudentDecorator(IPerson person) {
        super(person);
    }

    @Override
    public String getRoles() {
        return super.getRoles() + ", Student";
    }

    @Override
    public String getPermissions() {
        return super.getPermissions() + ", Submit assignments, View grades";
    }
}
