//esta es la ventana principal del programa, la cual tendra un boton, informacion de quien creo el juego y un boton para iniciar el juego y que me redireccione a otra ventana 

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class ventanaPrincipal extends JFrame {
    JPanel panel;
    JLabel etiqueta;
    JLabel etiqueta2;
    JButton botonIniciar;

    public ventanaPrincipal() {
        this.setVisible(true);
        this.setSize(850, 600);// esto define el ancho y el alto de la ventana
        this.setTitle("Juego de secuencia");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        //
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0, 0, 850, 600);
        panel.setBackground(java.awt.Color.GRAY);

        //agregamos la etuiqueta que contenga el nombre del creador del juego y su ID)
        etiqueta = new JLabel("Juego creado por: Jessid Alexander Agudelo Herrera: 202478460");
        etiqueta.setBounds(300, 200, 300, 50);
        etiqueta.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 20));
        etiqueta.setForeground(java.awt.Color.WHITE);
        panel.add(etiqueta);

        //agregamos una segunda etiqueta que contenga informacion del juego
        JLabel etiqueta2 = new JLabel("El juego consiste en repetir la secuencia de colores que se muestra en pantalla, recuerda qeu tienes un tiempo determinado para completar la secuencia sino perderas y tendras que iniciar de nuevo");
        etiqueta2.setBounds(300, 250, 300, 50);
        etiqueta2.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 20));
        etiqueta2.setForeground(java.awt.Color.WHITE);
        panel.add(etiqueta2);

        //agregamos el boton de iniciar
        JButton botonIniciar = new JButton("Iniciar");
        botonIniciar.setBounds(375, 350, 100, 50);
        botonIniciar.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 20));
        botonIniciar.setForeground(java.awt.Color.BLACK);
        botonIniciar.setBackground(java.awt.Color.WHITE);

        //damos la accion al boton
        botonIniciar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //aqui va la accion que se ejecuta al presionar el boton
                //abrimos la ventana del juego
                ventanaJuego ventanaJuego = new ventanaJuego();
                //cerramos la ventana principal
                dispose();
            }
        });

        this.add(panel);
        panel.add(botonIniciar);
    }
}
