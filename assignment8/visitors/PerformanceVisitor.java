package visitors;

import elements.Student;
import elements.Teacher;
import interfaces.ISchoolVisitor;

public class PerformanceVisitor implements ISchoolVisitor {

    @Override
    public void visitStudent(Student student) {
        if (student.getGrade() > 90)
            System.out.println(student.getName() + " gets increased scholarship");
        else if (student.getGrade() > 70)
            System.out.println(student.getName() + " gets regular scholarship");
        else
            System.out.println(student.getName() + " does not get scholarship");
    }

    @Override
    public void visitTeacher(Teacher teacher) {
        if (teacher.getYearsTeaching() > 10)
            System.out.println(teacher.getName() + " gets promotion to Senior Teacher");
        else
            System.out.println(teacher.getName() + " is on track for growth");
    }
}
