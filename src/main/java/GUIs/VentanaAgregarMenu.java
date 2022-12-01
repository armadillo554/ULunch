package GUIs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaAgregarMenu extends Ventana implements ActionListener {
    private JButton guardar;
    private JButton volver;

    public VentanaAgregarMenu(){
        guardar=this.generarBoton("Guardar", 145, 540, 80, 33, Font.DIALOG, 10);
        volver=this.generarBoton("Volver", 150, 590, 67, 33, Font.DIALOG, 10);

        guardar.addActionListener(this);
        volver.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        this.dispose();
        if (e.getSource()==guardar){

            new VentanaOpcionesAdmin();
        }else {
            new VentanaOpcionesAdmin();
        }
    }
}