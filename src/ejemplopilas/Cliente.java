package ejemplopilas;

import javax.swing.JOptionPane;

public class Cliente {
    String id, ape, nom;
    
    public Cliente(){
        id = ape = nom = "-";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public void setId() {
        id = JOptionPane.showInputDialog("Ingrese numero de ID:");
    }

    public String getApe() {
        return ape;
    }

    public void setApe(String ape) {
        this.ape = ape;
    }
    
    public void setApe() {
        ape = JOptionPane.showInputDialog("Ingrese apellido:");
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public void setNom() {
        nom = JOptionPane.showInputDialog("Ingrese nombre:");
    }

    @Override
    public String toString() {
        return "Cliente " + "\nid=" + id + "\nape=" + ape + ", \nnom=" + nom + "\n";
    }
}
