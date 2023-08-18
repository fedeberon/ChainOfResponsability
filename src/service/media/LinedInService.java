package service.media;

public class LinedInService extends  MediaService {

    public MediaService siguiente;

    @Override
    public void handle(String email, String password) {
        if (email.contains("@linkedin.com")) {
            System.out.println("Lo manejo LinkedIn Service");
        } else {
            siguiente.handle(email, password);
        }

    }
}
