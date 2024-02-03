package ejemplopilas;

import javax.swing.JOptionPane;

public class PilaClientes {
    Cliente pila[];
    int tamano, indice, cantElementos;
    
    public PilaClientes(){
        tamano = cantElementos = 0;
        indice = -1;
    }
    
    public void crear(){
        tamano = Utils.leerInt(
                "Ingrese el tamaño de la pila");
        pila = new Cliente[tamano];
    }
    
    public int getTamano(){
        return tamano;
    }
    
    public int getCantElementos(){
        return cantElementos;
    }
    
    public boolean vacia(){
        if(getCantElementos() == 0) return true;
        else return false;
    }
    
    public boolean llena(){
        if(cantElementos == tamano) return true;
        else return false;
    }
    
    public void info(){
        if (vacia()) {
            JOptionPane.showMessageDialog(null, 
                "Pila vacia");
        } else {
           JOptionPane.showMessageDialog(null, 
                "Vacia? " + vacia() + "\n" + 
                "Llena? " + llena() + "\n" +
                "Capacidad maxima = " + getTamano() + "\n" +
                "Cant Elementos añadidos = " + getCantElementos() + "\n" +
                "Cima = " + cima()); 
        }
    }
    
    public Cliente cima(){
        if (vacia()) return null;
        else return pila[indice];
    }
    
    public void push(){
        if (llena()) {
            JOptionPane.showMessageDialog(null, 
                "Pila llena");
        } else {
            Cliente obj = new Cliente();
            obj.setId();
            obj.setApe();
            obj.setNom();
            
            indice++;
            pila[indice] = obj;
            cantElementos++;
        }
    }
    
    public Cliente pop(){
        if (vacia()) {
            return null;
        } else {
            Cliente tmp = pila[indice];
            pila[indice] = null;
            indice--;
            cantElementos--;
            return tmp;
        }
    }
    
    public void limpiar(){
        if (vacia()) {
            JOptionPane.showMessageDialog(null, 
                "Pila vacia");
        } else {
            while (!vacia()) {                
                pop();
            }
            JOptionPane.showMessageDialog(null, 
                "Se vacio la Pila");
        }
    }
    
    public void recorrer(){
        if (vacia()) {
            JOptionPane.showMessageDialog(null, 
                "Pila vacia");
        } else {
            Cliente pila_tmp[] = new Cliente[cantElementos];
            int indice_tmp = 0;
            System.out.println("Elementos de la Pila");
            while (!vacia()) {                
                Cliente n = pop();
                System.out.println(n);
                pila_tmp[indice_tmp] = n;
                indice_tmp++;
            }
            indice_tmp--;
            for (; indice_tmp >= 0; indice_tmp--) {
                indice++;
                pila[indice] = pila_tmp[indice_tmp];
                cantElementos++;
            }
        }
    }
}
