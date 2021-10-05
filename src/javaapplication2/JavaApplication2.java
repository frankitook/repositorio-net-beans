/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.*;
import static java.time.Clock.system;
import javax.swing.JOptionPane;

/**
 *
 * @author Franco
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        JOptionPane.showMessageDialog(null, "franco gimenez");//Muestro mi nombre en la consola
        
        int a , b,suma;
         a=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese numero"));
         b=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese numero"));
        JOptionPane.showMessageDialog(null, ""+(a+b));
        
        String h="hola que tal";
        
        JOptionPane.showMessageDialog(null, h);
        JOptionPane.showMessageDialog(null, "gg");
      //holis
        suma=a+b;
         
        JOptionPane.showMessageDialog(null, suma);    
          
        System.out.println(suma);
        //asd
        
        h = "hola que tal";
      System.out.println(h);
      
     
   }
    
  
}

