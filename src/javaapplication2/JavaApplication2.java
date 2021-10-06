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
        
        
        JOptionPane.showMessageDialog(null, "Bienvenido");
        
       int op=0;
       
       while(op!=4) {
           
      op=Integer.parseInt(JOptionPane.showInputDialog(null, "1-Sumar\n "
                                                            + "2-Restar\n "
                                                            + "3-Multiplicar\n "
                                                            + "4-Salir\n"+"\n"
                                                            + "Ingrese una opcion:"));
        int a , b,suma;
         a=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese numero"));
         b=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese numero"));
        JOptionPane.showMessageDialog(null, ""+(a+b));
        
        String h="hola que tal";
        
        JOptionPane.showMessageDialog(null, h);
            
        //holanda
      
      switch(op){
          case 1:
             
              int a,b;
              a= Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el primer numero entero"));
              b= Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el segundo numero entero"));
              JOptionPane.showMessageDialog(null, a+b);
              break;
              
          case 2:
               int c,d;
              c= Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el primer numero entero"));
              d= Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el segundo numero entero"));
              JOptionPane.showMessageDialog(null, c+d);
              break; 
              
          case 3:
               int e,f;
              e= Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el primer numero entero"));
              f= Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el segundo numero entero"));
              JOptionPane.showMessageDialog(null, e*f);
              break; 
      
      }
      
       }
     
   }
    
  
}

