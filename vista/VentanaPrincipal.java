package vista;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame
{
    //atributos
    public PanelUsuario miPanelUsuario;
    public VentanaInteracion miVentanaInteracion;




    //constructor
    public VentanaPrincipal ()
    {
        //definicion del layout de la ventana 
        this.setLayout(null);
        

        //agregar el panel usuario
        miPanelUsuario = new PanelUsuario();
        miPanelUsuario.setBounds(0, 0, 400, 400);
        this.add(miPanelUsuario);

        



        //caracteristicas de la ventana
        this.setTitle("RECICLAAPP");
        this.setSize(400, 400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);

         //icono de la ventana
        Image icon = new ImageIcon(getClass().getResource("imagenes/icono.png")).getImage();
            setIconImage(icon);

    }

    public void CrearVentanaInteracion()
    {
         miVentanaInteracion = new VentanaInteracion();

    }




}


