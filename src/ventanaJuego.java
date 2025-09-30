//importamos las librerias necesarias
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.Border;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class ventanaJuego {
    public ventanaJuego(){
        JFrame ventanaJuego = new JFrame();
        ventanaJuego.setVisible(true);
        ventanaJuego.setSize(850,600);// esto define el ancho y el alto de la ventana
        ventanaJuego.setTitle("Juego de secuencia");
        ventanaJuego.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventanaJuego.setResizable(false);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0,0,850,600);
        panel.setBackground(java.awt.Color.DARK_GRAY);

        //agregamos la etuiqueta que contenga el nombre del creador del juego y su ID)
        JLabel etiqueta = new JLabel("Ventana del juego");
        etiqueta.setBounds(350,200,300,50);
        etiqueta.setFont(new java.awt.Font("Arial",java.awt.Font.PLAIN,20));
        etiqueta.setForeground(java.awt.Color.WHITE);
        panel.add(etiqueta);

        ventanaJuego.add(panel);
    }
}
