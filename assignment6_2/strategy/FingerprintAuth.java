public class FingerprintAuth implements IAuthStrategy {
    private String storedPassword;

    public FingerprintAuth(String password) {
        this.storedPassword = password;
    }

    @Override
    public boolean auth(String login, String password) {
        System.out.println("Authenticating " + login + " with fingerprint");
        return password.equals(storedPassword);
    }
}
