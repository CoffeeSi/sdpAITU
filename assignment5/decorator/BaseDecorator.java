package decorator;
public abstract class BaseDecorator implements IPerson {
    private IPerson person;

    public BaseDecorator(IPerson person) {
        this.person = person;
    }

    @Override
    public String getFullname() {
        return person.getFullname();
    }

    @Override
    public String getRoles() {
        return person.getRoles();
    }

    @Override
    public String getPermissions() {
        return person.getPermissions();
    }
}
