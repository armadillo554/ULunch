package GUIs;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaAppAdmin extends Ventana implements ActionListener {
    private JButton ingresar;
    private JLabel etiquetaUsuario;
    private JLabel etiquetaContrasena;
    private JTextField usuario;
    private JTextField contrasena;

    public VentanaAppAdmin(){
        ingresar=this.generarBoton("Ingresar", 115, 450, 120, 30);
        etiquetaUsuario=this.generarEtiqueta("Usuario", 25, 300, 100, 20);
        etiquetaContrasena=this.generarEtiqueta("Contraseña", 25, 370, 100, 20);
        usuario=this.generarCampoDeTexto(25, 330, 300, 30);
        contrasena=this.generarCampoDeTexto(25, 400,300, 30);

        ingresar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.dispose();
        if (e.getSource()==ingresar){


            new VentanaOpcionesAdmin();
        }
    }
}