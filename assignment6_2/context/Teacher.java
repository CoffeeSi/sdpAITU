public class Teacher extends User {
    public Teacher(String login) {
        super(login);
    }

    @Override
    public void accessSystem(String password) {
        if (authStrategy.auth(login, password)) {
            System.out.println("Teacher access granted for " + login);
        } else {
            System.out.println("Teacher access denied for " + login);
        }
    }
}
