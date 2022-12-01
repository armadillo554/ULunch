package GUIs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaMenusDelDia extends Ventana implements ActionListener {

    private JButton comprarMenu1;
    private JButton comprarMenu2;
    private JButton volver;

    public VentanaMenusDelDia(){
        comprarMenu1 = this.generarBoton("Comprar", 220, 250, 93, 33, Font.DIALOG, 12);
        comprarMenu2 = this.generarBoton("Comprar", 220, 525, 93, 33, Font.DIALOG, 12);
        volver = this.generarBoton("Volver", 265, 610, 67, 33, Font.DIALOG, 10);

        volver.addActionListener(this);
        comprarMenu1.addActionListener(this);
        comprarMenu2.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        this.dispose();
        if (e.getSource()== comprarMenu1){
            new VentanaQR();
        }else if (e.getSource()==comprarMenu2){
            new VentanaQR();
        }else {
            new VentanaIniciarSesionApp();
        }
    }
}