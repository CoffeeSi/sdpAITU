public class FaceAuth implements IAuthStrategy {
    private String storedPassword;

    public FaceAuth(String password) {
        this.storedPassword = password;
    }

    @Override
    public boolean auth(String login, String password) {
        System.out.println("Authenticating " + login + " with face");
        return password.equals(storedPassword);
    }
}
