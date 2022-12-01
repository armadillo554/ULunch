package GUIs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaQR extends Ventana implements ActionListener {
    private JButton volver;

    public VentanaQR(){
        volver = this.generarBoton("Volver", 265, 610, 67, 33, Font.DIALOG, 10);

        volver.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        this.dispose();
        new VentanaAppUsuario();
    }
}