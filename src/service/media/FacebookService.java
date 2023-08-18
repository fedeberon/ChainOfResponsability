package service.media;

public class FacebookService extends  MediaService {

    public MediaService siguiente;

    @Override
    public void handle(String email, String password) {
        if (email.contains("@facebook.com")) {
            System.out.println("Lo manejo Facebook Service");
        } else {
            siguiente.handle(email, password);
        }

    }
}
