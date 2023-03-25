<<<<<<< HEAD
package modelo;

public class Material {
    
}
=======
package modelo;

public class Material 
{
    private String nombre;
    private String tipo;

    public Material(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    // getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
>>>>>>> 86cbcdf2bdd3ea6a5be6bb231dbf8e2203a9821e
