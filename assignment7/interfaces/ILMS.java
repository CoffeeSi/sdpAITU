package interfaces;

public interface ILMS {
    void subscribe(IUser user);
    void unsubscribe(IUser user);
    void notify(IUser user, String message);
    void notifyAll(String message);
}
