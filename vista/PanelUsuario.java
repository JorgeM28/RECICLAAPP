package vista;


import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelUsuario extends JPanel
{
    //atributos
    private JLabel lbUsuario;
    private JButton btIngresar;
    

    //metodos

    public PanelUsuario()
    {

    


        //definicion del panel
        this.setLayout(null);
        this.setBackground(Color.GREEN);


        //borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("ZONA DE REGISTRO");
        borde.setTitleJustification(TitledBorder.CENTER);
        borde.setTitleColor(Color.BLUE);
        this.setBorder(borde);


        //etiqueta del usuario
        lbUsuario = new JLabel("USUARIO");
        lbUsuario.setBounds(170, 50, 100, 30);
        this.add(lbUsuario);

        //caja de texto del usuario
        JTextField txtUsuario = new JTextField();
        txtUsuario.setBounds(150, 100, 100, 30);
        this.add(txtUsuario);

        //crear un boton que abra otra ventana
         JButton btIngresar = new JButton("INGRESAR");
            btIngresar.setBounds(150, 150, 100, 30);
            btIngresar.setActionCommand("INGRESAR");
            this.add(btIngresar);


        


       


    }

}