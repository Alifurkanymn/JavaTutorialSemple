package inheritance;

public class UserManager {

    public void addUser(User user){
        System.out.println(user.getName() + " isimli kullanıcı kayıt oldu !");
    }

    public void deleteUser(User user){
        System.out.println(user.getName() + " isimli kullanıcının kaydı silindi !");
    }

    public void updateUser(User user){
        System.out.println(user.getName() + " isimli kullanıcısı güncellendi !");
    }

    public void listUser(User[] users){
        for(User user : users ){
           System.out.println(user.getName() + " isimli kullanıcı sistemimize üye.");
        }
    }
}
