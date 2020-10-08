/**
 *
 * @author Said Mariano
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MiVentana extends JFrame{
    public MiVentana(){
        super("MI OTRA VENTANA");
        setSize(500, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());
        JLabel etiqueta = new JLabel("NOMBRE: ");
        JTextField texto = new JTextField(20);
        JButton boton = new JButton("ACEPTAR");
        cp.add(etiqueta);
        cp.add(texto);
        cp.add(boton);
    }
}
