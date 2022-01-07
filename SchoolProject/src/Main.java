public class Main {
    public static void main(String[] args) {

        //add 3 teachers
        for(int i = 0; i < 3; i++){
            School.teachers.add(new Teacher());
        }

        //add 10 students
        for(int i = 0; i < 10; i++){
            School.students.add(new Student());
        }

        //check array size
        System.out.println(School.teachers.size());
        System.out.println(School.students.size());

        //print both lists
        System.out.println("-----Teacher List-----");
        School.printTeachList();
        System.out.println("-----Student List-----");
        School.printStudentList();

        //remove 1 teacher
        School.delTeach("teacherteacher");

        //remove 2 students
        School.delStudent("studentstudent");
        School.delStudent("studentstudent");

        //check array size again
        System.out.println(School.teachers.size());
        System.out.println(School.students.size());
    }
}
