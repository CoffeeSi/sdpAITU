public abstract class User {
    protected String login;
    protected IAuthStrategy authStrategy;

    public User(String login) {
        this.login = login;
    }

    public void setStrategy(IAuthStrategy authStrategy) {
        this.authStrategy = authStrategy;
    }

    public abstract void accessSystem(String password);
}
