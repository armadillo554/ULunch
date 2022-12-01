package GUIs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaOpcionesAdmin extends Ventana implements ActionListener {
    private JLabel etiquetaBienvenida;
    private JButton agregarMenu;
    private JButton editarMenu;
    private JButton borrarMenu;
    private JButton volver;

    public VentanaOpcionesAdmin(){
        etiquetaBienvenida=this.generarEtiqueta("Bienvenido ", 50, 167, 360, 40);
        agregarMenu=this.generarBoton("Agregar Menú", 105, 310, 150,30);
        editarMenu=this.generarBoton("Editar Menú", 110, 370, 140, 30);
        borrarMenu=this.generarBoton("Borrar Menú", 110, 430, 140, 30);
        volver=this.generarBoton("Volver",150, 580, 67, 33, Font.DIALOG, 10);

        agregarMenu.addActionListener(this);
        editarMenu.addActionListener(this);
        borrarMenu.addActionListener(this);
        volver.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        this.dispose();
        if (e.getSource()==agregarMenu){

            new VentanaAgregarMenu();
        } else if (e.getSource()==editarMenu) {

            new VentanaEditarMenu();
        } else if (e.getSource()==borrarMenu) {

            new VentanaBorrarMenu();
        }else {
            new VentanaAppAdmin();
        }
    }
}