package vista;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class VentanaPrincipal extends JFrame
{
    //----------------------
    //Atributos
    //----------------------
public PanelUsuario miUsuario;
private JLabel lbImagen;
private ImageIcon iImagen;

//Constructor
public VentanaPrincipal()
{
//Definición del layout de la ventana
this.setLayout(null);

//crear el panel del usuario
miUsuario = new PanelUsuario();
miUsuario.setBounds(0, 0, 850, 550);
add(miUsuario);








//Caracteristicas de la ventana


this.setTitle(" RECICLAAPP");
this.setSize(850,550);
this.setLocationRelativeTo(null);
this.setDefaultCloseOperation(EXIT_ON_CLOSE);
this.setResizable(false);
this.setVisible(true);

 //icono de la ventana
 Image icon = new ImageIcon(getClass().getResource("imagenes/icono.png")).getImage();
 setIconImage(icon);

























}
   
    



}
