package publisher;
import java.util.ArrayList;

import interfaces.ILMS;
import interfaces.IUser;
import subject.Parent;
import subject.Student;

public class MoodleLMS implements ILMS {
    private ArrayList<IUser> users;

    public MoodleLMS() {
        users = new ArrayList<>();
    }

    @Override
    public void subscribe(IUser user) {
        if (!users.contains(user))
            users.add(user);
    }

    @Override
    public void unsubscribe(IUser user) {
        if (users.contains(user))
            users.remove(user);
    }

    @Override
    public void notify(IUser user, String message) {
        if (users.contains(user))
            user.update(message);

        for (IUser parent : users) {
            if (parent instanceof Parent && ((Parent)parent).getChildren().contains(user)) {
                parent.update(message);
            }
        }
    }

    @Override
    public void notifyAll(String message) {
        for (IUser user : users) {
            user.update(message);
        }
    }

    public void publishGrade(Student student, String grade) {
        String message = "Grade posted for " + student.getName() + ": " + grade;
        notify(student, message);
    }

    public void scheduleExam(String course, String date) {
        String message = "Exam scheduled for " + course + " on " + date;
        notifyAll(message);
    }

}
