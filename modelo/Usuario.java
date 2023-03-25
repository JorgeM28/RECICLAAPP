package modelo;


public class Usuario 
{
    private String nombre;
    private String direccion;

    public Usuario(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    // getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
