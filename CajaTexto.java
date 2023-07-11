import javax.swing.*;
import java.awt.event.*;

public class CajaTexto extends JFrame implements ActionListener{

    private JTextField cajatexto1;
    private JTextField cajatexto2;
    private JTextField cajatexto3;
    private JLabel texto1;
    private JLabel texto2;
    private JButton boton1;
    private JButton boton2;

    public CajaTexto(){
        setLayout(null);

        //Caja de texto
        cajatexto1 = new JTextField();
        cajatexto1.setBounds(10,10,350,20);
        add(cajatexto1);
        
        cajatexto2 = new JTextField();
        cajatexto2.setBounds(10,70,350,20);
        add(cajatexto2);
        
        cajatexto3 = new JTextField();
        cajatexto3.setBounds(10,120,350,20);
        add(cajatexto3);

        //Label de texto
        texto1 = new JLabel("Ingresa tu nombre");
        texto1.setBounds(10,7,200,100);
        add(texto1);

        texto2 = new JLabel("Ingresa tu apellido");
        texto2.setBounds(10,50,200,100);
        add(texto2);

        //Boton
        boton1 = new JButton("Enviar");
        boton1.setBounds(10,150,100,30);
        add(boton1);
        boton1.addActionListener(this);

        boton2 = new JButton("Borrar");
        boton2.setBounds(150,150,100,30);
        add(boton2);
        boton2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent evento){
        if(evento.getSource()==boton1){
            String nombre = cajatexto2.getText();            
            String apellido = cajatexto3.getText();
            cajatexto1.setText(nombre + " " + apellido);
        }
    }

    public static void main (String [] args){
        CajaTexto ventana1 = new CajaTexto();
        ventana1.setBounds(50,50,400,300);
        ventana1.setVisible(true);
        ventana1.setResizable(false);
    }
}