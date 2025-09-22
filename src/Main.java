import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JLabel;
import javax.swing.JFrame;

public class Main{
    public static void main(String[] args){
        JLabel etiqueta = new JLabel();
        etiqueta.setText("Hola mundo");



        miVentana ventana = new miVentana();
        miVentana.add(etiqueta);
    }
}