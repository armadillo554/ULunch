package GUIs;

import DominioProblema.Alumno;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javax.swing.JOptionPane.showMessageDialog;

public class VentanaIniciarSesionApp extends Ventana implements ActionListener {
    private JTextField matricula;
    private JTextField contrasena;
    private JButton ingresar;
    private JButton registrarse;
    private JButton volver;
    private JLabel etiquetaMatricula;
    private JLabel etiquetaContrasena;

    public VentanaIniciarSesionApp(){
        etiquetaMatricula =this.generarEtiqueta("Matricula", 30, 235, 105,25, Font.DIALOG, 15);
        matricula = this.generarCampoDeTexto(30,260, 300, 30);
        etiquetaContrasena = this.generarEtiqueta("Contraseña", 30, 315, 150, 25, Font.DIALOG, 15);
        contrasena = this.generarCampoDeTexto(30,335, 300, 30);
        registrarse = this.generarBoton("Registrarse", 30, 385, 85, 20, Font.DIALOG, 8);
        ingresar = this.generarBoton("Ingresar", 135, 385, 88, 33, Font.DIALOG, 12);
        volver = this.generarBoton("Volver", 265, 610, 67, 33, Font.DIALOG, 10);

        ingresar.addActionListener(this);
        registrarse.addActionListener(this);
        volver.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.dispose();
        if (e.getSource()==ingresar){   //Verificar matricula ingresada valida, contraseña valida y que ambas corresponden entre si
            Alumno alumno = new Alumno(matricula.getText(), contrasena.getText());
            if (alumno.validarDatos()){
                new VentanaMenusDelDia();
            }else {
                new VentanaIniciarSesionApp();
                showMessageDialog(null, "Datos incorrectos");
            }
        }else if (e.getSource()==registrarse) {
            new VentanaRegistrarUsuario();
            }else{
            new VentanaAppUsuario();
        }
    }
}