package domian;

public class Main {

    public static void main(String[] args) {
        /*
        Usuario usuario = new Usuario(); //Instancia de la clase
        usuario.setId(1);
        usuario.setNombre("fede");
        usuario.setAppelido("beron");
        */


       Usuario usuario = new Usuario.UsuarioBuilder()
                                .withNombre("fede")
                                .withId(1)
                                .withApellido("beron")
                                .build();



        System.out.println(usuario);

    }


}
