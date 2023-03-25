<<<<<<< HEAD
package modelo;

public class AplicacionReciclaje {
    
}
=======
package modelo;

import java.util.ArrayList;
//import java.util.Scanner;

public class AplicacionReciclaje {
    public static void main(String[] args) {

        // Crear algunos centros de reciclaje

        ArrayList<CentroReciclaje> centrosReciclaje = new ArrayList<>();
        ArrayList<String> materialesAceptados1 = new ArrayList<>();
        materialesAceptados1.add("Papel");
        materialesAceptados1.add("Cartón");
        CentroReciclaje centroReciclaje1 = new CentroReciclaje("Centro de reciclaje 1", "Calle 123", materialesAceptados1);
        centrosReciclaje.add(centroReciclaje1);

        ArrayList<String> materialesAceptados2 = new ArrayList<>();
        materialesAceptados2.add("Plástico");
        materialesAceptados2.add("Vidrio");

    }
    
}
>>>>>>> 86cbcdf2bdd3ea6a5be6bb231dbf8e2203a9821e
