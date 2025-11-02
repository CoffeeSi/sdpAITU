import publisher.MoodleLMS;
import subject.Parent;
import subject.Student;

public class Main {
    public static void main(String[] args) {
        MoodleLMS moodle = new MoodleLMS();

        Student karinaStudent = new Student("Karina");
        Student farizaStudent = new Student("Fariza");
        Parent arlanParent = new Parent("Arlan", farizaStudent);

        moodle.subscribe(karinaStudent);
        moodle.subscribe(farizaStudent);
        moodle.subscribe(arlanParent);

        moodle.publishGrade(karinaStudent, "A");
        moodle.scheduleExam("Math", "2025-11-10");
        moodle.unsubscribe(farizaStudent);
        moodle.publishGrade(farizaStudent, "B+");
    }
}
