package facade;

public class LessonFacade {
    private Teacher teacher = new Teacher();
    private Student student = new Student();

    public void startOnlineLesson() {
        teacher.createOnlineLesson();
        teacher.sendInvite();
        student.joinOnlineLesson();
    }
}
