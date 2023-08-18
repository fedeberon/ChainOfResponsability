package domian;

import java.util.UUID;

public class Usuario {

    private Integer id;
    private String nombre;

    private String appelido;

    public Usuario() {

    }

    public Usuario(UsuarioBuilder builder) {
        this.id = builder.id;
        this.nombre  = builder.nombre;
        this.appelido = builder.apelido;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAppelido() {
        return appelido;
    }

    public void setAppelido(String appelido) {
        this.appelido = appelido;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", appelido='" + appelido + '\'' +
                '}';
    }


    public static class UsuarioBuilder {
        private Integer id;
        private String nombre;
        private String apelido;


        public UsuarioBuilder withId(Integer id) {
            this.id = id;
            return this;
        }

        public UsuarioBuilder withNombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public UsuarioBuilder withApellido(String apellido) {
            this.apelido = apellido;
            return this;
        }


        public Usuario build() {
            return new Usuario(this);
        }


    }





}
