public class PasswordAuth implements IAuthStrategy {
    private String storedPassword;

    public PasswordAuth(String password) {
        this.storedPassword = password;
    }

    @Override
    public boolean auth(String login, String password) {
        System.out.println("Authenticating " + login + " with password");
        return password.equals(storedPassword);
    }
}
