package decorator;

public class Main {
    public static void main(String[] args) {
        IPerson student = new StudentDecorator(new BasePerson("Yevgeniy"));
        System.out.println("Fullname: " + student.getFullname());
        System.out.println("Roles: " + student.getRoles());
        System.out.println("Permissions: " + student.getPermissions());

        IPerson teacher = new TeacherDecorator(new BasePerson("Dias"));
        System.out.println("Fullname: " + teacher.getFullname());
        System.out.println("Roles: " + teacher.getRoles());
        System.out.println("Permissions: " + teacher.getPermissions());

        IPerson studentTeacher = new StudentDecorator(
                                    new TeacherDecorator(
                                        new BasePerson("Arlan")));
        System.out.println("Fullname: " + studentTeacher.getFullname());
        System.out.println("Roles: " + studentTeacher.getRoles());
        System.out.println("Permissions: " + studentTeacher.getPermissions());
    }
}
