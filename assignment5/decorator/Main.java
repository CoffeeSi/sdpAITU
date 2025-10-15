package decorator;

public class Main {
    public static void printInfo(IPerson person) {
        System.out.println("Fullname: " + person.getFullname());
        System.out.println("Roles: " + person.getRoles());
        System.out.println("Permissions: " + person.getPermissions());
    }

    public static void main(String[] args) {
        IPerson student = new StudentDecorator(new BasePerson("Yevgeniy"));
        printInfo(student);

        IPerson teacher = new TeacherDecorator(new BasePerson("Dias"));
        printInfo(teacher);

        IPerson headTeacher = new TeacherDecorator(new PrivilegedPerson("Denis"));
        printInfo(headTeacher);

        IPerson studentTeacher = new StudentDecorator(
                                    new TeacherDecorator(
                                        new BasePerson("Arlan")));
        printInfo(studentTeacher);
    }
}
