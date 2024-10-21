package inheritance;

public class InstructorManager extends UserManager {
    public void addInstructor(Instructor instructor){
        System.out.println(instructor.getName() + " isimli eğitmen kayıt oldu !");
    }

    public void deleteInstructor(Instructor instructor){
        System.out.println(instructor.getName() + " isimli eğitmen silindi !");
    }

    public void updateInstructor(Instructor instructor){
        System.out.println(instructor.getName() + " isimli eğitmen güncellendi !");
    }

    public void listInstructor(Instructor[] instructors){
        for (Instructor instructor : instructors){
            System.out.println(instructor.getName() + " sistemimizde eğitmen !");
        }
    }
    public void listSpecialization(Instructor[] instructors){
        for (Instructor instructor : instructors){
            System.out.println(instructor.getName() + " isimli eğitmenimiz" + instructor.getSpecialization() + " alanında uzman !");
        }
    }

    public void listRating(Instructor[] instructors){
        for (Instructor instructor : instructors){
            System.out.println(instructor.getName() + " isimli eğitmenimizin" + instructor.getRating() + " ratingi bu şekilde !");
        }
    }
}
