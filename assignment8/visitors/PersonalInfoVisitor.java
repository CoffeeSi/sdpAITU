package visitors;

import elements.Student;
import elements.Teacher;
import interfaces.ISchoolVisitor;

public class PersonalInfoVisitor implements ISchoolVisitor {
    @Override
    public void visitStudent(Student student) {
        System.out.println("Name: " + student.getName());
        System.out.println("Grade: " + student.getGrade());
    }

    @Override
    public void visitTeacher(Teacher teacher) {
        System.out.println("Name: " + teacher.getName());
        System.out.println("Years of teaching: " + teacher.getYearsTeaching());
    }
}
