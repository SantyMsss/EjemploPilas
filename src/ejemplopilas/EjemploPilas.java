package ejemplopilas;

import javax.swing.JOptionPane;

public class EjemploPilas {
    
    public void menu(){
        //PilaEnteros pe = new PilaEnteros();
        PilaClientes pe = new PilaClientes();
        int opc;
        Cliente n;
        do {            
            opc = Utils.leerInt(
                    "1. Crear pila\n" + 
                    "2. Info pila\n" +
                    "3. Adicionar (push)\n" +    
                    "4. Consultar Cima\n" +  
                    "5. Eliminar (pop)\n" +  
                    "6. Vaciar pila\n" +    
                    "7. Recorrer\n" +         
                    "0. Salir");
            switch (opc) {
                case 1: pe.crear(); break;
                case 2: pe.info(); break;
                case 3: pe.push(); break;
                case 4: n = pe.cima();
                        if (n == null) {
                            JOptionPane.showMessageDialog(null, 
                                "Pila vacia");
                        } else {
                           JOptionPane.showMessageDialog(null, 
                                "Cima = " + n); 
                        }
                        break;
                case 5: n = pe.pop();
                        if (n == null) {
                            JOptionPane.showMessageDialog(null, 
                                "Pila vacia");
                        } else {
                           JOptionPane.showMessageDialog(null, 
                                "Se elimino = " + n); 
                        }
                        break;
                case 6: pe.limpiar(); break;
                case 7: pe.recorrer();break;
                case 0: break;
                default:
                    JOptionPane.showMessageDialog(
                            null, "Opcion incorrecta");
            }
        } while (opc != 0);
    }
    
    public static void main(String[] args) {
        EjemploPilas ep = new EjemploPilas();
        ep.menu();
    }
}
