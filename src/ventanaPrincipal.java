//esta es la ventana principal del programa, la cual tendra un boton, informacion de quien creo el juego y un boton para iniciar el juego y que me redireccione a otra ventana 

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ventanaPrincipal extends JFrame{
    JPanel panel;
    JLabel etiqueta;
    JLabel etiqueta2;
    JButton botonIniciar;
    public ventanaPrincipal(){
        this.setVisible(true);
        this.setSize(850,600);// esto define el ancho y el alto de la ventana
        this.setTitle("Juego de secuencia");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        //
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBounds(0,0,850,600);
        panel.setBackground(java.awt.Color.GRAY);

        //agregamos la etuiqueta que contenga el nombre del creador del juego y su ID y a su vez le daremos estilos a la etiqueta para que muestre toda la informacion del usuario
        etiqueta = new JLabel("Juego creado por: Jessid Alexander Agudelo Herrera: 202478460");
        etiqueta.setBounds(300,200,300,50);
        etiqueta.setFont(new java.awt.Font("Arial",java.awt.Font.PLAIN,20));
        etiqueta.setForeground(java.awt.Color.WHITE);
        panel.add(etiqueta);

        //agregamos una segunda etiqueta que contenga informacion del juego
        JLabel etiqueta2 = new JLabel();
        etiqueta2.setText("<html><div style='text-align: center;'>Este es un juego de secuencia, en el cual deberas recordar la secuencia de colores que se te mostrara y luego deberas repetirla en el orden correcto. <br> Si logras completar la secuencia, pasaras al siguiente nivel, pero si fallas, perderas y tendras que empezar de nuevo. <br> ¿Estas listo para el desafio?</div></html>");
        etiqueta2.setHorizontalAlignment(JLabel.CENTER);
        etiqueta2.setVerticalAlignment(JLabel.CENTER);
        


        etiqueta2.setBounds(300,250,300,50);
        etiqueta2.setFont(new java.awt.Font("Arial",java.awt.Font.PLAIN,20));
        etiqueta2.setForeground(java.awt.Color.WHITE);
        panel.add(etiqueta2);

        //agregamos el boton de iniciar
        JButton botonIniciar = new JButton("Iniciar");
        botonIniciar.setBounds(375,350,100,50);
        botonIniciar.setFont(new java.awt.Font("Arial",java.awt.Font.PLAIN,20));
        botonIniciar.setForeground(java.awt.Color.BLACK);
        botonIniciar.setBackground(java.awt.Color.WHITE);

        //damos la accion al boton
        botonIniciar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                //aqui va la accion que se ejecuta al presionar el boton
                //abrimos la ventana del juego
                VentanaJuego ventanaJuego = new VentanaJuego();
                //cerramos la ventana principal
                dispose();
            }
        });

        //mostramos el panel y agregamos el boton iniciar
        panel.add(botonIniciar);
        this.add(panel);


        //agregamos un condicional para validar que la pantalla si funcione bien
        if(this.isVisible()){
            System.out.println("La ventana se ha abierto correctamente");
        }else{
            System.out.println("La ventana no se ha abierto correctamente");
    
        }

        //agregamos un condicional para validar que el boton si funcione bien
        botonIniciar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.out.println("El boton se ha presionado correctamente");

    }
        });

    }
}
