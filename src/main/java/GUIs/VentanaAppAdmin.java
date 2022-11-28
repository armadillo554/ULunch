package GUIs;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaAppAdmin extends Ventana implements ActionListener {
    private JButton ingresar;
    private JTextField usuario;
    private JTextField contrasena;

    public VentanaAppAdmin(){
        inicializarVentanaAdmin();
        setSize(360,740);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void inicializarVentanaAdmin() {

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}