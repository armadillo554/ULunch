package GUIs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaEditarMenu extends Ventana implements ActionListener {
    private JButton guardarCambios;
    private JButton volver;

    public VentanaEditarMenu(){
        guardarCambios=this.generarBoton("Guardar cambios", 145, 540, 80, 33, Font.DIALOG, 10);
        volver=this.generarBoton("Volver", 150, 590, 67, 33, Font.DIALOG, 10);

        guardarCambios.addActionListener(this);
        volver.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.dispose();
        if (e.getSource()==guardarCambios){

            new VentanaOpcionesAdmin();
        }else {
            new VentanaOpcionesAdmin();
        }
    }
}