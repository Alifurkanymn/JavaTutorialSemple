package inheritance;

public class Instructor extends User {
    String specialization;
    double rating;

    public Instructor(int id, String name, String surname, String email, String password, String specialization, double rating) {
        super(id, name, surname, email, password);
        this.specialization = specialization;
        this.rating = rating;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
