/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication20;
import javax.swing.*;
/**
 *
 * @author elolop
 */
public class JavaApplication20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {  
        String entrada = JOptionPane.showInputDialog("Introduce varios nombres");
        System.out.print("Los nombres son  "+entrada+"  y estos son las letras que tiene  "+entrada.length());
    }
    
}
