public class Student extends User {
    public Student(String login) {
        super(login);
    }

    @Override
    public void accessSystem(String password) {
        if (authStrategy.auth(login, password)) {
            System.out.println("Student portal opened for " + login);
        } else {
            System.out.println("Student login failed for " + login);
        }
    }
}
