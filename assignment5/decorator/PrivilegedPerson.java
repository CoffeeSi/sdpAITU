package decorator;

public class PrivilegedPerson implements IPerson {
    private String fullname;

    public PrivilegedPerson(String fullname) {
        this.fullname = fullname;
    }

    @Override
    public String getFullname() {
        return fullname;
    }

    @Override
    public String getRoles() {
        return "User with sunnoths";
    }

    @Override
    public String getPermissions() {
        return "View profile, manage users";
    }
}
