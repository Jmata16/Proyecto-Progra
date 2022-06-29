package proyecto_cajas;
public class Ingreso extends Dinero {
    public Ingreso(double ingreso, String description) {
        this.dinero=ingreso;
        this.description=description;
    }

    public String toString() {
        return "Ingreso a su favor en concepto de " + this.description
                + ". Importe total: " + this.dinero ;
    }
    
}
