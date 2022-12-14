package GUIs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaBorrarMenu extends Ventana implements ActionListener {
    private JButton borrarMenu1;
    private JButton borrarMenu2;
    private JButton volver;
    public VentanaBorrarMenu(){
        borrarMenu1=this.generarBoton("Borrar", 240, 260, 80, 33, Font.DIALOG, 12);
        borrarMenu2=this.generarBoton("Borrar", 240, 525, 80, 33, Font.DIALOG, 12);
        volver=this.generarBoton("Volver", 150, 590, 67, 33, Font.DIALOG, 10);

        borrarMenu1.addActionListener(this);
        borrarMenu2.addActionListener(this);
        volver.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==borrarMenu1 || e.getSource()==borrarMenu2){

            new VentanaOpcionesAdmin();
        }else {
            new VentanaOpcionesAdmin();
        }
    }
}