public class Course {

    //fields
    private String subject;
    private String teacher;
    private int grade;

    //constructor
    Course() {
        subject = "course";
        teacher = "course";
        grade = 1;
    }

    Course(String subject, String teacher, int grade) {
        this.subject = subject;
        this.teacher = teacher;
        this.grade = grade;
    }

    //getters and setters
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
