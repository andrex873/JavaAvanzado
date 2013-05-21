package com.mybank.gui;

import com.mybank.data.*;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.io.*;
import javax.swing.*;

public class ATMClient {

    private static final String USAGE = "USAGE: java com.mybank.gui.ATMClient <dataFilePath>";
    private JPanel panelIzquierda;
    private JPanel panelDerecha;
    private JTextArea output;
    private JTextField dataEtry;
    private JTextField message;

    private JButton b1;
    private JButton b2;
    private JButton b3;

    public ATMClient() {
        panelIzquierda = new JPanel(new GridLayout(2, 1));
        panelDerecha = new JPanel(new BorderLayout());
        b1 = new JButton("Boton 1");
        b2 = new JButton("Boton 2");
        b3 = new JButton("Boton 3");        
        output = new JTextArea(75, 10);
        dataEtry = new JTextField(10);
        dataEtry.setEditable(false);        
        message = new JTextField(75);
        message.setEditable(false);

    }

    public void launchFrame(){
        JFrame frame = new JFrame("Java Bank test - Application");
        frame.add(panelIzquierda, BorderLayout.WEST);
        frame.add(panelDerecha, BorderLayout.CENTER);

        JPanel panelBotones = new JPanel(new GridLayout(3, 1));
        panelBotones.add(b1);
        panelBotones.add(b2);
        panelBotones.add(b3);

        JPanel panelBotonesContenedor = new JPanel(new BorderLayout());
        panelBotonesContenedor.add(panelBotones, BorderLayout.CENTER);
        panelBotonesContenedor.add(dataEtry, BorderLayout.SOUTH);
        panelIzquierda.add(panelBotonesContenedor);

        JPanel panelNumeros = new JPanel(new GridLayout(4, 3));
        String[] botonesNombre = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0", ".", "Enter"};
        for(String texto: botonesNombre){
            panelNumeros.add(new JButton(texto));
        }
        panelIzquierda.add(panelNumeros);

        panelDerecha.add(output, BorderLayout.CENTER);
        panelDerecha.add(message, BorderLayout.SOUTH);

        frame.pack();
        frame.setSize(800, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        

    }

    public static void main(String[] args) {

        // Retrieve the dataFilePath command-line argument
        if (args.length != 1) {
            System.out.println(USAGE);
        } else {
            String dataFilePath = args[0];

            try {
                System.out.println("Reading data file: " + dataFilePath);
                // Create the data source and load the Bank data
                DataSource dataSource = new DataSource(dataFilePath);
                dataSource.loadData();

                // Run the ATM GUI
                ATMClient client = new ATMClient();
                client.launchFrame();

            } catch (IOException ioe) {
                System.out.println("Could not load the data file.");
                System.out.println(ioe.getMessage());
                ioe.printStackTrace(System.err);
            }
        }
    }
    // PLACE YOUR GUI CODE HERE
}
