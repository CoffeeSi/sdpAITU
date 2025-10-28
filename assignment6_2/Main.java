
public class Main {
    public static void main(String[] args) {
        User admin = new Admin("Yevgeniy");
        User student = new Student("Denis");
        User teacher = new Teacher("Arlan");

        admin.setStrategy(new PasswordAuth("qwerty123"));
        student.setStrategy(new FaceAuth("face_001"));
        teacher.setStrategy(new FingerprintAuth("fingerprint_987"));

        admin.accessSystem("admin123");
        System.out.println();
        student.accessSystem("face_002");
        System.out.println();
        teacher.accessSystem("fingerprint_987");
        System.out.println();

        student.setStrategy(new PasswordAuth("ytrewq321"));
        student.accessSystem("ytrewq321");
    }
}
