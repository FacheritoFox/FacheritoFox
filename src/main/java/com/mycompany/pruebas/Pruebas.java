/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pruebas;

import javax.swing.JOptionPane;
/**
 *
 * @author jgarces
 */
public class Pruebas {

    public static void main(String[] args) {
       String hola = JOptionPane.showInputDialog("Ingresar nombre") ;
        String jaja = JOptionPane.showInputDialog("Ingresar tu edad " + hola) ;
        System.out.println("Prueba " + hola +" "+ jaja);
          String jajai = JOptionPane.showInputDialog("Ingresar nombre") ;
        String dimelo = JOptionPane.showInputDialog("Ingresar tu edad " + hola) ;
        System.out.println("Prueba " + jajai +" "+ dimelo);
    }
}






