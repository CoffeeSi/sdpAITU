package interfaces;

import elements.Student;
import elements.Teacher;

public interface ISchoolVisitor {
    void visitStudent(Student student);
    void visitTeacher(Teacher teacher);
}
