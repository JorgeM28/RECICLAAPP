package vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelUsuario extends JFrame 
{
    //----------------------
    //Atributos
    //----------------------
    
    //----------------------
    //Constructor
    //----------------------
    public PanelUsuario()
    {
        //Definición del layout de la ventana
        this.setLayout(null);
        this.setBackground(Color.GREEN);

        //crear etiqueta 
    

        TitledBorder borde = BorderFactory.createTitledBorder("RECICLAAPP");
        borde.setTitleColor(Color.BLACK);
        borde.setTitleFont(getFont("ARIAL",12,8));
        setBorder(borde);

        //crear etiqueta usuario
        JLabel lbNombre = new JLabel("Nombre");
        lbNombre.setBounds(300, 180, 200, 30);
        add(lbNombre);

        //entrada de texto
        JTextField txtNombre = new JTextField();
        txtNombre.setBounds(300, 200, 200, 30);
        add(txtNombre);


        




       
        




//etiqueta




        
        //Caracteristicas de la ventana
        this.setTitle("RECICLAAPP");
        this.setSize(850,550);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
    }

    private Font getFont(String string, int i, int j) {
        return null;
    }

    private void setBorder(TitledBorder borde) {
    }
    


}
