import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;

/*
public class miVentana extends JFrame {
    miVentana(){
        //JFrame ventana = new JFrame();
        this.setVisible(true);
        this.setSize(850,600);// esto define el ancho y el alto de la ventana
        this.setTitle("Juego de secuencia");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);

        ImageIcon imagen = new ImageIcon("imagen.jpg");
        this.setIconImage(imagen.getImage());
        this.getContentPane().setBackground(Color.GRAY);
    }
}
*/

public class miVentana extends JFrame implements ActionListener {
    // creamos la instancia de boton como global
    JButton boton;

    miVentana() {

        //cremos un icono
        //ImageIcon imagen = new image


        //creamos el boton
        boton = new JButton("soy un btn");
        boton.setBounds(200,100,100,50);
        boton.addActionListener(this);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        setSize(800, 600);
        setVisible(true);
        this.setTitle("Ventana");
        this.add(boton);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == boton){
            System.out.println("boton precionado!");
            boton.setText(":)");
            boton.setFocusable(false); //este espacio solo permite datos booleanos
            boton.setBackground(Color.RED);
        }
    }
}
