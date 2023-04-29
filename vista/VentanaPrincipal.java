package vista;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaPrincipal extends JFrame
{
    //----------------------
    //Atributos
    //----------------------
public PanelEntradaDatos miPanelEntradaDatos;
public PanelOperaciones miPanelOperaciones;
public PanelResultados miPanelResultado;
private JLabel lbImagen;
private ImageIcon iImagen;

//Constructor
public VentanaPrincipal()
{
//Definición del layout de la ventana
this.setLayout(null);

//Caracteristicas de la ventana
this.setTitle("Empresa Automotriz");
this.setSize(800,500);
this.setLocationRelativeTo(null);
this.setDefaultCloseOperation(EXIT_ON_CLOSE);
this.setResizable(false);
this.setVisible(true);

}
   
    



}
