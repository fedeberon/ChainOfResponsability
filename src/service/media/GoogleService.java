package service.media;

public class GoogleService extends MediaService {

    public MediaService siguiente;

    @Override
    public void handle(String email, String password) {
        if (email.contains("@gmail.com")) {
            System.out.println("Lo manejo Google Service");
        } else {
            siguiente.handle(email, password);
        }

    }
}
