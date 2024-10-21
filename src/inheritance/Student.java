package inheritance;

public class Student extends User{
    String enrolledCourses;
    int progressPercentage;

    public Student(int id, String name, String surname, String email, String password, String enrolledCourses, int progressPercentage) {
        super(id, name, surname, email, password);
        this.enrolledCourses = enrolledCourses;
        this.progressPercentage = progressPercentage;
    }

    public String getEnrolledCourses() {
        return enrolledCourses;
    }

    public void setEnrolledCourses(String enrolledCourses) {
        this.enrolledCourses = enrolledCourses;
    }

    public int getProgressPercentage() {
        return progressPercentage;
    }

    public void setProgressPercentage(int progressPercentage) {
        this.progressPercentage = progressPercentage;
    }
}
