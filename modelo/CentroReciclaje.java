package modelo;

import java.util.ArrayList;

public class CentroReciclaje {
    private String nombre;
    private String direccion;
    private ArrayList<String> materialesAceptados;

    public CentroReciclaje(String nombre, String direccion, ArrayList<String> materialesAceptados) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.materialesAceptados = materialesAceptados;
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

    public ArrayList<String> getMaterialesAceptados() {
        return materialesAceptados;
    }

    public void setMaterialesAceptados(ArrayList<String> materialesAceptados) {
        this.materialesAceptados = materialesAceptados;
    }
}
