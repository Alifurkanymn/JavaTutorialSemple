package inheritance;

public class StudentManager extends UserManager {

    public void addStudent(Student student){
        System.out.println(student.getName() + " isimli öğrencimiz kayıt oldu !");
    }

    public void deleteStudent(Student student){
        System.out.println(student.getName() + " isimli öğrencimizin kaydı silindi !");
    }

    public void updateStudent(Student student){
        System.out.println(student.getName() + " isimli öğrencimiz güncellendi !");
    }

    public void listStudent(Student[] students){
        for(Student student : students){
            System.out.println(student.getName() + " isimli öğrencimiz sistemimize kayıtlı !");
        }
    }
    public void enrolledCoursesStudent(Student[] students){
        for(Student student : students){
            System.out.println(student.getName() + " isimli öğrencimizin sistemde kayıt olduğu kurs " + student.getEnrolledCourses());
        }
    }

    public void progressPercentageStudent(Student[] students){
        for(Student student : students){
            System.out.println(student.getName() + " isimli öğrencimizin sistemde kayıt olduğu kurs " + student.getEnrolledCourses() + " ve ilerleme yüzdesi " + student.getProgressPercentage());
        }
    }
}
