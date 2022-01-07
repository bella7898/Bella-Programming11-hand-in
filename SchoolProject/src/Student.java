public class Student {

    //fields
    private String firstName  ;
    private String lastName   ;
    private int grade         ;
    static int studentNum = 10;
    private int studentID     ;

    //constructors
    Student(){
        firstName = "student";
        lastName = "student";
        grade = 0;
        studentID = studentNum;
        studentNum++;
    }

    Student(String firstName, String lastName, int grade){
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
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

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    //method studentByName prints the info of an individual student by their name
    public static void studentByName(String name){
        for(int i = 0; i < School.students.size(); i++){
            String info = "Name: "+ School.students.get(i).firstName + School.students.get(i).lastName + "      Grade: "+ School.students.get(i).grade + "      ID: "+ School.students.get(i).studentID;
            String checkName = School.students.get(i).firstName + School.students.get(i).lastName;
            if(name.equals(checkName)){
                System.out.println(info);
            }
        }
    }

    //method studentByGrade prints the info of students by their grade
    public static void studentsByGrade(int grade){
        for(int i = 0; i < School.students.size(); i++){
            String info = "Name: "+ School.students.get(i).firstName + School.students.get(i).lastName + "      Grade: "+ School.students.get(i).grade + "      ID: "+ School.students.get(i).studentID;
            int checkGrade = School.students.get(i).grade;
            if(grade == checkGrade){
                System.out.println(info);
            }
        }
    }

    //method studentsByID prints the info of a student with the ID.
    public static void studentByID(int ID){
        for(int i = 0; i < School.students.size(); i++){
            String info = "Name: "+ School.students.get(i).firstName + School.students.get(i).lastName + "      Grade: "+ School.students.get(i).grade + "      ID: "+ School.students.get(i).studentID;
            int checkID = School.students.get(i).studentID;
            if(ID == checkID){
                System.out.println(info);
            }
        }
    }
}
