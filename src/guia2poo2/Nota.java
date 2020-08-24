/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2poo2;

import javax.swing.JOptionPane;

/**
 *
 * @author GUILLERMO
 */
public class Nota {
    
    public static void main(String[] args) {
        // TODO code application logic here
    
    String n;
    float nota;
    n = JOptionPane.showInputDialog("Digite la nota del alumno");
    nota = Float.parseFloat(n);
    if(nota>=7)
    {
        JOptionPane.showMessageDialog(null, "El alumno aprobo con: " + n, "Felicidades!!!",JOptionPane.INFORMATION_MESSAGE);
    }
    else
        {   
         if(nota>=6.50 && nota<=6.99)
            {
            JOptionPane.showMessageDialog(null, "El alumno reprobo con: "+ n,"Tiene la opcion de recuperacion",JOptionPane.WARNING_MESSAGE);
            }
             else
            {
                    {
                    JOptionPane.showMessageDialog(null, "El alumno reprobo con: "+ n,"No tiene la opcion de recuperacion",JOptionPane.ERROR_MESSAGE);
                    } 
                     
            }
        }
    }
}
