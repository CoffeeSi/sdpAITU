import java.util.ArrayList;

import elements.Student;
import elements.Teacher;
import interfaces.ISchoolElement;
import visitors.PerformanceVisitor;
import visitors.PersonalInfoVisitor;

public class Main {
    public static void main(String[] args) {
        Student yevgeniyStudent = new Student("Yevgeniy", 78);
        Student arlanStudent = new Student("Arlan", 66);

        Teacher denisTeacher = new Teacher("Denis", 3);
        Teacher meirhamTeacher = new Teacher("Meirhan", 11);

        ArrayList<ISchoolElement> members = new ArrayList<>();
        members.add(yevgeniyStudent);
        members.add( arlanStudent);
        members.add(denisTeacher);
        members.add(meirhamTeacher);

        PerformanceVisitor performanceVisitor = new PerformanceVisitor();
        PersonalInfoVisitor personalInfoVisitor = new PersonalInfoVisitor();

        for (ISchoolElement member : members) {
            member.accept(personalInfoVisitor);
            member.accept(performanceVisitor);
        }
    } 
}
