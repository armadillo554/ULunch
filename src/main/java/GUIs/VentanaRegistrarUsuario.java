package GUIs;

import DominioProblema.Alumno;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.JOptionPane.showMessageDialog;

public class VentanaRegistrarUsuario extends Ventana implements ActionListener {
    private JTextField matricula;
    private JTextField contrasena;
    private JButton registrarse;
    private JButton volver;
    private JLabel etiquetaMatricula;
    private JLabel etiquetaContrasena;

    public VentanaRegistrarUsuario(){
        etiquetaMatricula =this.generarEtiqueta("Matricula", 30, 235, 105,25, Font.DIALOG, 15);
        matricula = this.generarCampoDeTexto(30,260, 300, 30);
        etiquetaContrasena = this.generarEtiqueta("Contraseña", 30, 315, 150, 25, Font.DIALOG, 15);
        contrasena = this.generarCampoDeTexto(30,335, 300, 30);
        registrarse = this.generarBoton("Registrarse", 133, 385, 100, 33, Font.DIALOG, 12);
        volver = this.generarBoton("Volver", 265, 610, 67, 33, Font.DIALOG, 10);

        registrarse.addActionListener(this);
        volver.addActionListener(this);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        this.dispose();
        if (e.getSource()==registrarse){
            Alumno alumno = new Alumno(matricula.getText(), contrasena.getText());
            if (alumno.registrar()){
                showMessageDialog(null,"Usuario registrado con exito");
                new VentanaAppUsuario();
            }else {
                new VentanaRegistrarUsuario();
                showMessageDialog(null, "Matricula no valida o ya registrada");
            }
        }else {
            new VentanaIniciarSesionApp();
        }
    }
}