import javax.swing.*;
import java.awt.*;

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
