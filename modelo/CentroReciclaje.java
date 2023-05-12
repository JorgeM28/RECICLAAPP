package modelo;

public class CentroReciclaje
{
    //atributos
    private String nombre;
    private String direccion;
    private String telefono;
    private String horario;
    private String descripcion;
    

    //constructor
    public CentroReciclaje(String nombre, String direccion, String telefono, String horario, String descripcion) 
    {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.horario = horario;
        this.descripcion = descripcion;
        
    }

    //getters y setters

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


    public String getTelefono() {
        return telefono;
    }


    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    public String getHorario() {
        return horario;
    }


    public void setHorario(String horario) {
        this.horario = horario;
    }


    public String getDescripcion() {
        return descripcion;
    }


    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
    
}