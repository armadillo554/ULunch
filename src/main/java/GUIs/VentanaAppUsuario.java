package GUIs;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaAppUsuario extends Ventana implements ActionListener {
    private JButton iniciarSesion;
    private JButton anonimo;

    public VentanaAppUsuario(){
        iniciarSesion = this.generarBoton("Iniciar Sesión", 115, 400, 120, 30);
        anonimo = this.generarBoton("Anónimo", 115, 450, 120, 30);

        iniciarSesion.addActionListener(this);
        anonimo.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.dispose();
        if (e.getSource()==iniciarSesion){
            new VentanaIniciarSesionApp();
        }else{
            new VentanaAnonimoApp();
        }
    }
}