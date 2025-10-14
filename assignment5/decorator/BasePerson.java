package decorator;

public class BasePerson implements IPerson {
    private String fullname;

    public BasePerson(String fullname) {
        this.fullname = fullname;
    }

    @Override
    public String getFullname() {
        return fullname;
    }

    @Override
    public String getRoles() {
        return "User";
    }

    @Override
    public String getPermissions() {
        return "View profile";
    }
}
