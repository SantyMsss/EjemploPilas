
package ejemplopilas;

import javax.swing.JOptionPane;


public class Utils {
    
    public static int leerInt(String mensaje){
     String entrada = JOptionPane.showInputDialog(mensaje);
     int numero = Integer.parseInt(entrada);
     return numero;
    }
    
    public static long leerlong(String mensaje){
     String entrada = JOptionPane.showInputDialog(mensaje);
     long numero = Integer.parseInt(entrada);
     return numero;
    }
    
    public static double leerdouble(String mensaje){
     String entrada = JOptionPane.showInputDialog(mensaje);
     Double numero = Double.parseDouble(entrada);
     return numero;
    }
    
    
}
