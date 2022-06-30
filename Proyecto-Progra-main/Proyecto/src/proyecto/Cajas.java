
package proyecto;

import javax.swing.JOptionPane;

public class Cajas {
    //variables
    private String ingresoDia;
    private String ingresoDiaT;
    public Cajas(){
        this.ingresoDia="";
        this.ingresoDiaT="";
    } 
    public String getIngresoDia() {
        return ingresoDia;
    }
    public void setIngresoDia(String ingresoDia) {
        this.ingresoDia = ingresoDia;
    }
    public String getIngresoDiaT() {
        return ingresoDiaT;
    }
    public void setIngresoDiaT(String ingresoDiaT) {
        this.ingresoDiaT = ingresoDiaT;
    }
      public void Caja(){
    JOptionPane.showMessageDialog(null, "Aqui van las cajas");
    } 
}