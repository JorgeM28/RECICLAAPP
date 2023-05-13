package vista;

import javax.swing.JDialog;

public class VentanaInteracion extends JDialog 
{
    
    //atributos


    //constructor
    public VentanaInteracion()
    {
        //definicion del layout de la ventana 
        this.setLayout(null);
        
        //caracteristicas de la ventana
        this.setTitle("RECICLAAPP");
        this.setSize(400, 400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);

    }


}
