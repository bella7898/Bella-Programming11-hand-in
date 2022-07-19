public class Teacher {

    //fields
    private String firstName;
    private String lastName;
    private String subject;

    //constructor
    Teacher() {
        firstName = "teacher";
        lastName = "teacher";
        subject = "teacher";
    }

    Teacher(String firstName, String lastName, String subject) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
    }

    //getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    //method printTeacher to print an individual by their name (full name)
    public static void printTeacher(String name) {
        for (int i = 0; i < School.teachers.size(); i++) {
            String info = "Name: " + School.teachers.get(i).firstName + School.teachers.get(i).lastName + "         Subject: " + School.teachers.get(i).subject;
            String checkName = School.teachers.get(i).firstName + School.teachers.get(i).lastName;
            if (name.equals(checkName)) {
                System.out.println(info);
            }
        }
    }

    //method teachersBySubject prints teachers that teach one subject
    public static void teachersBySubject(String subject) {
        for (int i = 0; i < School.teachers.size(); i++) {
            String info = "Name: " + School.teachers.get(i).firstName + School.teachers.get(i).lastName + "       Subject: " + School.teachers.get(i).subject;
            String checkSubject = School.teachers.get(i).subject;
            if (subject.equals(checkSubject)) {
                System.out.println(info);
            }
        }
    }
}
