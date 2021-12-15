package proytectoestructura;

public class NodoLSC {

    private Estacion datos;
    private NodoLSC siguiente;

    public NodoLSC() {
        this.siguiente = null;
    }

    public Estacion getDatos() {
        return datos;
    }

    public void setDatos(Estacion datos) {
        this.datos = datos;
    }

    public NodoLSC getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoLSC siguiente) {
        this.siguiente = siguiente;
    }

}
