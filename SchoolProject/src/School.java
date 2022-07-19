//import arraylist

import java.util.ArrayList;

public class School {

    //array lists
    static ArrayList<Teacher> teachers = new ArrayList<>();
    static ArrayList<Student> students = new ArrayList<>();
    static ArrayList<Course> courses = new ArrayList<>();

    //fields
    private String name;
    private String web;
    private String phone;

    //constructor
    School() {
        name = "school";
        web = "school";
        phone = "school";
    }

    //setters and getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    //in Main, one can add a new teacher/student with:
    //students.add(new Student());

    //method addTeach with parameters for their firstname, lastname, and subject
    public static ArrayList<Teacher> addTeach(String firstname, String lastname, String subject) {
        int i = teachers.size();
        teachers.add(i, new Teacher(firstname, lastname, subject));
        return teachers;
    }

    //method addStudent with parameters for their firstname, lastname, and grade
    public static ArrayList<Student> addStudent(String firstname, String lastname, int grade) {
        int i = students.size();
        students.add(i, new Student(firstname, lastname, grade));
        return students;
    }

    //method delTeach deletes a teacher by their name (parameter delName)
    public static ArrayList<Teacher> delTeach(String delName) {
        for (int i = 0; i < teachers.size(); i++) {
            String teachName = teachers.get(i).getFirstName() + teachers.get(i).getLastName();
            if (delName.equals(teachName)) {
                teachers.remove(i);
                return teachers;
            }
        }
        return teachers;
    }

    //method delStudent deletes student by their name (parameter delName)
    public static ArrayList<Student> delStudent(String delName) {
        for (int i = 0; i < students.size(); i++) {
            String stuName = students.get(i).getFirstName() + students.get(i).getLastName();
            if (delName.equals(stuName)) {
                students.remove(i);
                return students;
            }
        }
        return students;
    }

    //method to print all the students in the 'teachers' array
    public static void printTeachList() {
        for (int i = 0; i < teachers.size(); i++) {
            String first = teachers.get(i).getFirstName();
            String last = teachers.get(i).getLastName();
            String result = "[" + first + "" + last + "]";
            System.out.println(result);
        }
    }

    //method to print all the students in the 'students' array
    public static void printStudentList() {
        for (int i = 0; i < students.size(); i++) {
            String first = students.get(i).getFirstName();
            String last = students.get(i).getLastName();
            String result = "[" + first + "" + last + "]";
            System.out.println(result);
        }
    }

}

