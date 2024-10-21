package inheritance;

public class Main {
    public static void main(String[] args) {
        Student furkanYaman = new Student(1, "Ali Furkan", "Yaman", "alifurkanymn@gmail.com", "123456", "JavaCourses", 20);
        Student furkanYaman2 = new Student(1, "Ali Furkan2", "Yaman2", "alifurkanymn@gmail.com", "123456", "JavaCourses2", 20);

        Instructor furkan = new Instructor(1, "Furkan", "Yaman", "alifurkanymn@gmail.com", "123456", "Javascript", 5);
        Instructor furkan2 = new Instructor(1, "Furkan2", "Yaman2", "alifurkanymn@gmail.com", "123456", "Javascript", 5);

        Student[] students = {
                furkanYaman,
                furkanYaman2
        };

        Instructor[] instructors = {
                furkan,
                furkan2
        };

        UserManager userManager = new UserManager();
        InstructorManager instructorManager = new InstructorManager();
        StudentManager studentManager = new StudentManager();

        instructorManager.addInstructor(furkan);
        instructorManager.addInstructor(furkan2);
        instructorManager.listInstructor(instructors);
        instructorManager.listSpecialization(instructors);
        instructorManager.listRating(instructors);
        studentManager.addStudent(furkanYaman);
        studentManager.addStudent(furkanYaman2);
        studentManager.listStudent(students);
        studentManager.enrolledCoursesStudent(students);
        studentManager.progressPercentageStudent(students);
        userManager.addUser(furkanYaman);
        userManager.addUser(furkanYaman2);
        userManager.addUser(furkan);
        userManager.addUser(furkan2);
    }
}