/*public class ejemplosPractica {
         * en esta parte del curso veremos como se crean las etiquetas de manera basica *
            Etiquetas etiqueta  = new Etiquetas();
        miVentana ventana = new miVentana();

        con este metodo añadimos las etiquetas o label's
        JLabel etiquetas = new JLabel();
        etiquetas.setText("hello world");
         con este metodo añadimos una imagen
        ImageIcon imagen = new ImageIcon("imagen.png");
        etiquetas.setIcon(imagen);
         podemos cambiar la pocicion de las etuquetas con
        etiquetas.setHorizontalAlignment(JLabel.CENTER);//
        etiquetas.setVerticalAlignment(JLabel.CENTER);
         para cambiar el color de la fuente es:
        etiquetas.setForeground(Color.RED);
         cambiamos la fuente
        etiquetas.setFont(new Font("MV Boli", Font.PLAIN, 35));
         ajustar espacio entre label's o label con imagenes
        etiquetas.setIconTextGap(34);
         cambiar el color de la etiqueta del fondo de la etiqueta
        etiquetas.setBackground(Color.GRAY);
        etiquetas.setOpaque(true);
         añadimos un vorde a la etiqueta
        Border border = BorderFactory.createLineBorder(Color.red);
        etiquetas.setBorder(border);
         alinear cosas de la etiqueta: setVertical (etiquetas.setVerticalAlignament(JLabel.center)).
            este tambien sirve para mover la etiqueta o lo que esta en la etiqueta

        etiquetas.setBounds(0,0,250,350);


        * en esta parte del curso veremos com crear un panel interactivo
        JFrame marco = new JFrame();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setSize(850,600);
        marco.setLayout(null);
        marco.setVisible(true);
        marco.add(etiquetas);
        * esta es la segunda forma para crearla desde otra clase
        this.setVisible(true);
        this.setSize(850,600);// esto define el ancho y el alto de la ventana
        this.setTitle("Juego de secuencia");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);

        ImageIcon imagen = new ImageIcon("imagen.jpg");
        this.setIconImage(imagen.getImage());
        this.getContentPane().setBackground(Color.GRAY);

}
*/

/*
los paneles son intersecciones que nos permiten mejorar el aspecto de la app(tienen cierto parecido a los DIV en HTML)
 *en esta parte mostrare las cosas aprendidas en el curso de como implementar distintos paneles sobre otros*

import javax.swing.*;
import java.awt.*;// -agregamos una Imagen
ImageIcon icon = new ImageIcon("icon.png");


 -creamos una etiqueta dentro de los paneles
JLabel label = new JLabel("Hello World");
        label.setBounds(150,50,100,30);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);

 - agreganos un panel rojo
JPanel panelRojo = new JPanel();
        panelRojo.setBackground(Color.RED);
        panelRojo.setBounds(0,0,250,250);
- agregamos un panel Azul
JPanel panelAzul = new JPanel();
        panelAzul.setBackground(Color.BLUE);
        panelAzul.setBounds(250,0,250,250);
- agregamos un panel Verde
JPanel panelVerde = new JPanel();
        panelVerde.setBackground(Color.GREEN);
        panelVerde.setBounds(0,250,500,250);
        panelVerde.setLayout(new BorderLayout());

JFrame marco = new JFrame();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setLayout(null);
        marco.setSize(850,600);
        marco.setVisible(true);

agregamos la etiqueta
panelRojo.add(label)
panelVerde.add(Label)
        panelVerde.add(label);

        marco.add(panelRojo);
        marco.add(panelAzul);
        marco.add(panelVerde);
*/