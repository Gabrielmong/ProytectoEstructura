package proytectoestructura;

public class NodoLSC {

    private Dato datos;
    private NodoLSC siguiente;

    public NodoLSC() {
        this.siguiente = null;
    }

    public Dato getDatos() {
        return datos;
    }

    public void setDatos(Dato datos) {
        this.datos = datos;
    }

    public NodoLSC getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoLSC siguiente) {
        this.siguiente = siguiente;
    }

}
