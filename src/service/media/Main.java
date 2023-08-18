package service.media;

public class Main {

    public static void main(String[] args) {

        // Instancias de la clases/
        FacebookService facebook = new FacebookService();
        GoogleService google = new GoogleService();
        LinedInService linkedIn = new LinedInService();

        // Configuracion del orden de la cadena de responsabilidades.
        facebook.siguiente = google;
        linkedIn.siguiente = facebook;

        linkedIn.handle("fede@linkedin.com", "123");


    }
}
