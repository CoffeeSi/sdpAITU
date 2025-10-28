public class Admin extends User {
    public Admin(String login) {
        super(login);
    }

    @Override
    public void accessSystem(String password) {
        if (authStrategy.auth(login, password)) {
            System.out.println("Admin access granted for " + login);
        } else { 
            System.out.println("Admin access denied for " + login);
        }
    }
}
